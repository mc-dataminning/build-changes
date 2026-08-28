import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class doz extends dlu {
   public static final MapCodec<doz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, doz::new)
   );
   private static final Map<dlu, dlu> b = Maps.newHashMap();
   private static final feq c = dlu.b(6.0, 0.0, 6.0);
   private final dlu d;

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   public doz(dlu $$0, dzn.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      dzo $$8 = ($$0.h() instanceof cxa $$7 ? b.getOrDefault($$7.c(), dlw.a) : dlw.a).m();
      if ($$8.l()) {
         return bty.f;
      } else if (!this.q()) {
         return bty.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, eeo.c, $$3);
         $$4.a(awv.ah);
         $$0.a(1, $$4);
         return bty.a;
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (this.q()) {
         return bty.c;
      } else {
         cys $$5 = new cys(this.d);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dlw.gm.m(), 3);
         $$1.a($$3, eeo.c, $$2);
         return bty.a;
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new cys(this.d);
   }

   private boolean q() {
      return this.d == dlw.a;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dlu b() {
      return this.d;
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.a(dlw.uf) || $$0.a(dlw.ug);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (this.f($$0) && $$1.B_().j()) {
         boolean $$4 = this.d == dlw.ud;
         boolean $$5 = dnp.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            doo.a $$6 = doo.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awm.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dzo o(dzo $$0) {
      if ($$0.a(dlw.uf)) {
         return dlw.ug.m();
      } else {
         return $$0.a(dlw.ug) ? dlw.uf.m() : $$0;
      }
   }
}
