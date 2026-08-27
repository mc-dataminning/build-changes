import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekd extends ekh {
   public static final Codec<ekd> a = RecordCodecBuilder.create($$0 -> a($$0).and(eiv.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ekd::new));
   private final eiv.b b;

   public ekd(List<elu> $$0, eiv.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekj b() {
      return ekk.v;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      if ($$0.a(cpc.uj) && $$1.c(this.b.a()) instanceof chh $$2) {
         GameProfile $$3 = $$2.fS();
         $$0.x().a("SkullOwner", tl.a(new sw(), $$3));
      }

      return $$0;
   }

   public static ekh.a<?> a(eiv.b $$0) {
      return a($$1 -> new ekd($$1, $$0));
   }
}
