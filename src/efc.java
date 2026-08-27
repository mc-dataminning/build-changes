import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class efc extends eey {
   private final boolean k;
   private final Long2ObjectMap<eev> l = new Long2ObjectOpenHashMap();

   public efc(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(ctv $$0, bmh $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eex a() {
      return this.b(aui.a(this.b.cH().a), aui.a(this.b.cH().b + 0.5), aui.a(this.b.cH().c));
   }

   @Override
   public efd a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aui.a($$0), aui.a($$1), aui.a($$2)));
   }

   @Override
   public int a(eex[] $$0, eex $$1) {
      int $$2 = 0;
      Map<ic, eex> $$3 = Maps.newEnumMap(ic.class);

      for (ic $$4 : ic.values()) {
         eex $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ic $$6 : ic.c.a) {
         ic $$7 = $$6.h();
         eex $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable eex $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable eex $$0, @Nullable eex $$1, @Nullable eex $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected eex a(int $$0, int $$1, int $$2) {
      eex $$3 = null;
      eev $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == eev.u || $$4 == eev.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new hx($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eev c(int $$0, int $$1, int $$2) {
      return (eev)this.l.computeIfAbsent(hx.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eev a(cso $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eev a(cso $$0, int $$1, int $$2, int $$3, bmh $$4) {
      hx.a $$5 = new hx.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               eek $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dja $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), efa.b) && $$10.i()) {
                  return eev.u;
               }

               if (!$$9.a(asg.a)) {
                  return eev.a;
               }
            }
         }
      }

      dja $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, efa.b) ? eev.j : eev.a;
   }
}
