import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class emc extends emg {
   public static final Codec<emc> a = RecordCodecBuilder.create($$0 -> a($$0).and(eku.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, emc::new));
   private final eku.b b;

   public emc(List<ent> $$0, eku.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emi b() {
      return emj.v;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      if ($$0.a(cqn.uk) && $$1.c(this.b.a()) instanceof cis $$2) {
         GameProfile $$3 = $$2.fY();
         $$0.x().a("SkullOwner", tp.a(new ta(), $$3));
      }

      return $$0;
   }

   public static emg.a<?> a(eku.b $$0) {
      return a($$1 -> new emc($$1, $$0));
   }
}
