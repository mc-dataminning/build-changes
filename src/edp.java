import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edp extends edt {
   public static final Codec<edp> a = RecordCodecBuilder.create($$0 -> a($$0).and(ech.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, edp::new));
   private final ech.b b;

   public edp(List<efg> $$0, ech.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edv b() {
      return edw.v;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      if ($$0.a(cjb.tt) && $$1.c(this.b.a()) instanceof cbn $$2) {
         GameProfile $$3 = $$2.fP();
         $$0.w().a("SkullOwner", rd.a(new qr(), $$3));
      }

      return $$0;
   }

   public static edt.a<?> a(ech.b $$0) {
      return a($$1 -> new edp($$1, $$0));
   }
}
