import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dlg extends dhj {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final dvf b = dmx.b;
   public static final dvf c = dmx.c;
   public static final dvf d = dmx.d;
   public static final dvf e = dmx.e;
   public static final dvf f = dmx.f;
   public static final dvf g = dmx.g;
   private static final Map<jj, dvf> h = dmx.h;

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dun.d $$0) {
      super($$0);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(true))
            .b(c, Boolean.valueOf(true))
            .b(d, Boolean.valueOf(true))
            .b(e, Boolean.valueOf(true))
            .b(f, Boolean.valueOf(true))
            .b(g, Boolean.valueOf(true))
      );
   }

   @Override
   public duo a(czk $$0) {
      ddl $$1 = $$0.q();
      je $$2 = $$0.a();
      return this.o()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$2.a(this) ? $$0.b(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(h.get($$1.a(jj.c)), $$0.c(b))
         .b(h.get($$1.a(jj.d)), $$0.c(d))
         .b(h.get($$1.a(jj.f)), $$0.c(c))
         .b(h.get($$1.a(jj.e)), $$0.c(e))
         .b(h.get($$1.a(jj.b)), $$0.c(f))
         .b(h.get($$1.a(jj.a)), $$0.c(g));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.b(h.get($$1.b(jj.c)), $$0.c(b))
         .b(h.get($$1.b(jj.d)), $$0.c(d))
         .b(h.get($$1.b(jj.f)), $$0.c(c))
         .b(h.get($$1.b(jj.e)), $$0.c(e))
         .b(h.get($$1.b(jj.b)), $$0.c(f))
         .b(h.get($$1.b(jj.a)), $$0.c(g));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
