import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dht extends diq {
   public static final MapCodec<dht> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtk.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dht::new)
   );
   public static final dso b = dsn.u;
   public static final dso c = dsn.w;
   public static final dso d = dsn.q;
   protected static final ewf e = deu.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewf f = deu.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ewf g = deu.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ewf h = deu.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ewf i = deu.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewf j = deu.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewf k = deu.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewf l = deu.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewf m = ewc.a(deu.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), deu.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ewf n = ewc.a(deu.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), deu.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ewf o = ewc.a(deu.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), deu.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ewf F = ewc.a(deu.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), deu.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dtk G;

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(dtk $$0, drw.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == je.a.a ? f : e;
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      je.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      if ($$0.c(b)) {
         return ewc.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? k : l;
      }
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      if ($$0.c(b)) {
         return ewc.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? i : j;
      }
   }

   @Override
   protected ewf f(drx $$0, daz $$1, iz $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == je.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public drx a(cxv $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      je $$4 = $$0.g();
      je.a $$5 = $$4.o();
      boolean $$6 = $$5 == je.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == je.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.n().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(drx $$0) {
      return $$0.a(awl.L);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         je $$5 = $$3.cH();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avx.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dwq.h : dwq.d, $$2);
      return bqp.a($$1.B);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, dbl $$3, BiConsumer<cuk, iz> $$4) {
      if ($$3.j() == dbl.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avx.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dwq.d : dwq.h, $$2, dwq.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avx.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dwq.h : dwq.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(drx $$0, je $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
