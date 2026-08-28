import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dwj extends dln {
   public static final MapCodec<dwj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dud.a.b.fieldOf("kind").forGetter(dln::b), t()).apply($$0, dwj::new));
   public static final ebr<jb> d = dqs.e;
   private static final Map<jb, ffw> b = fft.c(dmr.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dwj> a() {
      return c;
   }

   protected dwj(dud.a $$0, eas.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jb.c));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public eat a(ddg $$0) {
      eat $$1 = super.a($$0);
      diq $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
