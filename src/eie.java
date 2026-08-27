import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eie extends eii {
   public static final Codec<eie> a = RecordCodecBuilder.create($$0 -> a($$0).and(egw.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eie::new));
   private final egw.b b;

   public eie(List<ejv> $$0, egw.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eik b() {
      return eil.v;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      if ($$0.a(cnb.ug) && $$1.c(this.b.a()) instanceof cfi $$2) {
         GameProfile $$3 = $$2.fR();
         $$0.w().a("SkullOwner", tc.a(new sn(), $$3));
      }

      return $$0;
   }

   public static eii.a<?> a(egw.b $$0) {
      return a($$1 -> new eie($$1, $$0));
   }
}
