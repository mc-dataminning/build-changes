import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dir extends deu {
   public static final MapCodec<dir> a = b(dir::new);
   public static final dso b = dki.b;
   public static final dso c = dki.c;
   public static final dso d = dki.d;
   public static final dso e = dki.e;
   public static final dso f = dki.f;
   public static final dso g = dki.g;
   private static final Map<je, dso> h = dki.h;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(drw.d $$0) {
      super($$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(true))
            .a(c, Boolean.valueOf(true))
            .a(d, Boolean.valueOf(true))
            .a(e, Boolean.valueOf(true))
            .a(f, Boolean.valueOf(true))
            .a(g, Boolean.valueOf(true))
      );
   }

   @Override
   public drx a(cxv $$0) {
      daz $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.n()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(h.get($$1.a(je.c)), $$0.c(b))
         .a(h.get($$1.a(je.d)), $$0.c(d))
         .a(h.get($$1.a(je.f)), $$0.c(c))
         .a(h.get($$1.a(je.e)), $$0.c(e))
         .a(h.get($$1.a(je.b)), $$0.c(f))
         .a(h.get($$1.a(je.a)), $$0.c(g));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a(h.get($$1.b(je.c)), $$0.c(b))
         .a(h.get($$1.b(je.d)), $$0.c(d))
         .a(h.get($$1.b(je.f)), $$0.c(c))
         .a(h.get($$1.b(je.e)), $$0.c(e))
         .a(h.get($$1.b(je.b)), $$0.c(f))
         .a(h.get($$1.b(je.a)), $$0.c(g));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
