import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnh extends diq implements dlv {
   public static final MapCodec<dnh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsm.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dnh::new)
   );
   public static final dso b = dsn.u;
   public static final dsv<dsw> c = dsn.af;
   public static final dso d = dsn.w;
   public static final dso e = dsn.C;
   protected static final int f = 3;
   protected static final ewf g = deu.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewf h = deu.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewf i = deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewf j = deu.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewf k = deu.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ewf l = deu.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dsm m;

   @Override
   public MapCodec<? extends dnh> a() {
      return a;
   }

   protected dnh(dsm $$0, drw.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(c, dsw.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dsw.a ? l : k;
      } else {
         switch ((je)$$0.c(aE)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if (!this.m.c()) {
         return bqp.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqp.a($$1.B);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, dbl $$3, BiConsumer<cuk, iz> $$4) {
      if ($$3.j() == dbl.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(drx $$0, dbt $$1, iz $$2, @Nullable cms $$3) {
      drx $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, enr.c, enr.c.a((dbw)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cms $$0, dbt $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avx.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dwq.h : dwq.d, $$2);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, enr.c, enr.c.a((dbw)$$1));
            }
         }
      }
   }

   @Override
   public drx a(cxv $$0) {
      drx $$1 = this.n();
      enq $$2 = $$0.q().b_($$0.a());
      je $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dsw.a : dsw.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == je.b ? dsw.b : dsw.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == enr.c));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(e) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dsm m() {
      return this.m;
   }
}
