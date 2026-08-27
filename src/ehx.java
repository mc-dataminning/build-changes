import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehx extends eib {
   public static final Codec<ehx> a = RecordCodecBuilder.create($$0 -> a($$0).and(egp.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ehx::new));
   private final egp.b b;

   public ehx(List<ejo> $$0, egp.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eid b() {
      return eie.v;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      if ($$0.a(cmu.ug) && $$1.c(this.b.a()) instanceof cfb $$2) {
         GameProfile $$3 = $$2.fR();
         $$0.w().a("SkullOwner", ta.a(new sl(), $$3));
      }

      return $$0;
   }

   public static eib.a<?> a(egp.b $$0) {
      return a($$1 -> new ehx($$1, $$0));
   }
}
