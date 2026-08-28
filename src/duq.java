import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class duq extends dpt implements dtb {
   public static final MapCodec<duq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ead.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, duq::new)
   );
   public static final eaf b = eae.y;
   public static final eam<ean> c = eae.ai;
   public static final eaf d = eae.A;
   public static final eaf f = eae.I;
   private static final Map<ja, feq> g = fen.d(dlu.c(16.0, 13.0, 16.0));
   private final ead h;

   @Override
   public MapCodec<? extends duq> a() {
      return a;
   }

   protected duq(ead $$0, dzn.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.B.b().b(e, ja.c).b(b, Boolean.valueOf(false)).b(c, ean.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == ean.a ? ja.a : ja.b));
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(f);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!this.h.c()) {
         return bty.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bty.a;
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dzo $$0, dip $$1, iu $$2, @Nullable cqs $$3) {
      dzo $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, evw.c, evw.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cqs $$0, dip $$1, iu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awm.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? eeo.h : eeo.d, $$2);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, evw.c, evw.c.a($$1));
            }
         }
      }
   }

   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = this.m();
      evv $$2 = $$0.q().b_($$0.a());
      ja $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? ean.a : ean.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == ja.b ? ean.b : ean.a);
      }

      if ($$0.q().D($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == evw.c));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(f) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected ead q() {
      return this.h;
   }
}
