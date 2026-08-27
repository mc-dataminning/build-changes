import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edt extends edx {
   public static final Codec<edt> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecl.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, edt::new));
   private final ecl.b b;

   public edt(List<efk> $$0, ecl.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edz b() {
      return eea.v;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      if ($$0.a(cjd.tt) && $$1.c(this.b.a()) instanceof cbp $$2) {
         GameProfile $$3 = $$2.fP();
         $$0.w().a("SkullOwner", rg.a(new qu(), $$3));
      }

      return $$0;
   }

   public static edx.a<?> a(ecl.b $$0) {
      return a($$1 -> new edt($$1, $$0));
   }
}
