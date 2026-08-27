import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class elg extends elk {
   public static final Codec<elg> a = RecordCodecBuilder.create($$0 -> a($$0).and(ejy.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, elg::new));
   private final ejy.b b;

   public elg(List<emx> $$0, ejy.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public elm b() {
      return eln.v;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      if ($$0.a(cpt.uj) && $$1.c(this.b.a()) instanceof cia $$2) {
         GameProfile $$3 = $$2.fU();
         $$0.x().a("SkullOwner", tn.a(new sy(), $$3));
      }

      return $$0;
   }

   public static elk.a<?> a(ejy.b $$0) {
      return a($$1 -> new elg($$1, $$0));
   }
}
