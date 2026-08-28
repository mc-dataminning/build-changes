import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dwf extends dli {
   public static final MapCodec<dwf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyl.q.fieldOf("color").forGetter(dli::b), t()).apply($$0, dwf::new));
   public static final ebr<jb> b = dqs.e;
   private static final Map<jb, ffw> c = fft.c(dmr.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dwf> a() {
      return a;
   }

   public dwf(cyl $$0, eas.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public eat a(ddg $$0) {
      eat $$1 = this.m();
      djp $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
