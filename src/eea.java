import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eea extends eee {
   public static final Codec<eea> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecs.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eea::new));
   private final ecs.b b;

   public eea(List<efr> $$0, ecs.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eeg b() {
      return eeh.v;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      if ($$0.a(cjk.tt) && $$1.c(this.b.a()) instanceof cbw $$2) {
         GameProfile $$3 = $$2.fQ();
         $$0.w().a("SkullOwner", rl.a(new qy(), $$3));
      }

      return $$0;
   }

   public static eee.a<?> a(ecs.b $$0) {
      return a($$1 -> new eea($$1, $$0));
   }
}
