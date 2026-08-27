import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eds extends edw {
   public static final Codec<eds> a = RecordCodecBuilder.create($$0 -> a($$0).and(eck.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eds::new));
   private final eck.b b;

   public eds(List<efj> $$0, eck.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edy b() {
      return edz.v;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      if ($$0.a(cjo.tt) && $$1.c(this.b.a()) instanceof cca $$2) {
         GameProfile $$3 = $$2.fR();
         $$0.w().a("SkullOwner", rj.a(new qw(), $$3));
      }

      return $$0;
   }

   public static edw.a<?> a(eck.b $$0) {
      return a($$1 -> new eds($$1, $$0));
   }
}
