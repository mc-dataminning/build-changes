import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edo extends eds {
   public static final Codec<edo> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecg.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, edo::new));
   private final ecg.b b;

   public edo(List<eff> $$0, ecg.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edu b() {
      return edv.v;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      if ($$0.a(cja.tt) && $$1.c(this.b.a()) instanceof cbm $$2) {
         GameProfile $$3 = $$2.fP();
         $$0.w().a("SkullOwner", rd.a(new qr(), $$3));
      }

      return $$0;
   }

   public static eds.a<?> a(ecg.b $$0) {
      return a($$1 -> new edo($$1, $$0));
   }
}
