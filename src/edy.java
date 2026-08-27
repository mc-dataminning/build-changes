import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edy extends eec {
   public static final Codec<edy> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecq.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, edy::new));
   private final ecq.b b;

   public edy(List<efp> $$0, ecq.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eee b() {
      return eef.v;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      if ($$0.a(cji.tt) && $$1.c(this.b.a()) instanceof cbu $$2) {
         GameProfile $$3 = $$2.fQ();
         $$0.w().a("SkullOwner", rj.a(new qx(), $$3));
      }

      return $$0;
   }

   public static eec.a<?> a(ecq.b $$0) {
      return a($$1 -> new edy($$1, $$0));
   }
}
