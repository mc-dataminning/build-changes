import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehm extends ehq {
   public static final Codec<ehm> a = RecordCodecBuilder.create($$0 -> a($$0).and(ege.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ehm::new));
   private final ege.b b;

   public ehm(List<ejd> $$0, ege.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ehs b() {
      return eht.v;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      if ($$0.a(cmk.ug) && $$1.c(this.b.a()) instanceof cer $$2) {
         GameProfile $$3 = $$2.fR();
         $$0.w().a("SkullOwner", sy.a(new sj(), $$3));
      }

      return $$0;
   }

   public static ehq.a<?> a(ege.b $$0) {
      return a($$1 -> new ehm($$1, $$0));
   }
}
