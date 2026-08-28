import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dwi extends dub {
   public static final MapCodec<dwi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ech.a.fieldOf("wood_type").forGetter(dub::d), t()).apply($$0, dwi::new));
   public static final ebr<jb> b = dqs.e;
   private static final Map<jb, ffw> c = fft.c(dmr.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dwi> a() {
      return a;
   }

   public dwi(ech $$0, eas.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = this.m();
      exa $$2 = $$0.q().b_($$0.a());
      djp $$3 = $$0.q();
      iv $$4 = $$0.a();
      jb[] $$5 = $$0.f();

      for (jb $$6 : $$5) {
         if ($$6.o().d()) {
            jb $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == exb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eat $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ffc o(eat $$0) {
      return c.get($$0.c(b)).a().f();
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, d);
   }
}
