import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eft extends efx {
   public static final Codec<eft> a = RecordCodecBuilder.create($$0 -> a($$0).and(eel.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eft::new));
   private final eel.b b;

   public eft(List<ehk> $$0, eel.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public efz b() {
      return ega.v;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      if ($$0.a(cle.tu) && $$1.c(this.b.a()) instanceof cdm $$2) {
         GameProfile $$3 = $$2.fR();
         $$0.w().a("SkullOwner", so.a(new rz(), $$3));
      }

      return $$0;
   }

   public static efx.a<?> a(eel.b $$0) {
      return a($$1 -> new eft($$1, $$0));
   }
}
