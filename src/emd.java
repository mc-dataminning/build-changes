import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emd extends ejm {
   public static final MapCodec<emd> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, emd::new)
   );
   public final boolean e;

   public emd(ejm.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      dyv.a $$1 = this.e ? dyv.a.a : dyv.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eke $$0, ejm.a $$1) {
      dmk $$2 = dmk.a($$1.f());
      jd $$3 = new jd($$1.h().d(), 90, $$1.h().e());
      emc.a $$4 = emc.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eje $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = ejm.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = ejm.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public ejv<?> e() {
      return ejv.m;
   }
}
