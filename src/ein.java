import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ein extends eir {
   public static final Codec<ein> a = RecordCodecBuilder.create($$0 -> a($$0).and(ehf.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ein::new));
   private final ehf.b b;

   public ein(List<eke> $$0, ehf.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eit b() {
      return eiu.v;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      if ($$0.a(cnj.uj) && $$1.c(this.b.a()) instanceof cfq $$2) {
         GameProfile $$3 = $$2.fR();
         $$0.w().a("SkullOwner", td.a(new so(), $$3));
      }

      return $$0;
   }

   public static eir.a<?> a(ehf.b $$0) {
      return a($$1 -> new ein($$1, $$0));
   }
}
