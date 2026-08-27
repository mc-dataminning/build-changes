import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ddw extends daa {
   public static final MapCodec<ddw> a = b(ddw::new);
   public static final dnq b = dfn.b;
   public static final dnq c = dfn.c;
   public static final dnq d = dfn.d;
   public static final dnq e = dfn.e;
   public static final dnq f = dfn.f;
   public static final dnq g = dfn.g;
   private static final Map<ih, dnq> h = dfn.h;

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(dmy.d $$0) {
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
   public dmz a(css $$0) {
      cwf $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(h.get($$1.a(ih.c)), $$0.c(b))
         .a(h.get($$1.a(ih.d)), $$0.c(d))
         .a(h.get($$1.a(ih.f)), $$0.c(c))
         .a(h.get($$1.a(ih.e)), $$0.c(e))
         .a(h.get($$1.a(ih.b)), $$0.c(f))
         .a(h.get($$1.a(ih.a)), $$0.c(g));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a(h.get($$1.b(ih.c)), $$0.c(b))
         .a(h.get($$1.b(ih.d)), $$0.c(d))
         .a(h.get($$1.b(ih.f)), $$0.c(c))
         .a(h.get($$1.b(ih.e)), $$0.c(e))
         .a(h.get($$1.b(ih.b)), $$0.c(f))
         .a(h.get($$1.b(ih.a)), $$0.c(g));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
