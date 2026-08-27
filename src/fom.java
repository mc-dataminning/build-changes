import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fom {
   private static final Logger a = LogUtils.getLogger();
   private static final ha[] b = ha.values();
   private static final int c = 60;
   private static final double d = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean e = true;
   @Nullable
   private Future<?> f;
   @Nullable
   private foq g;
   private final AtomicReference<fom.b> h = new AtomicReference<>();
   private final AtomicReference<fom.a> i = new AtomicReference<>();
   private final AtomicBoolean j = new AtomicBoolean(false);

   public void a(@Nullable foq $$0) {
      if (this.f != null) {
         try {
            this.f.get();
            this.f = null;
         } catch (Exception var3) {
            a.warn("Full update failed", var3);
         }
      }

      this.g = $$0;
      if ($$0 != null) {
         this.h.set(new fom.b($$0.f.length));
         this.a();
      } else {
         this.h.set(null);
      }
   }

   public void a() {
      this.e = true;
   }

   public void a(frc $$0, List<fqy.b> $$1) {
      for (fom.d $$2 : this.h.get().a().b) {
         if ($$0.a($$2.a.b())) {
            $$1.add($$2.a);
         }
      }
   }

   public boolean b() {
      return this.j.compareAndSet(true, false);
   }

   public void a(cpi $$0) {
      fom.a $$1 = this.i.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      fom.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(fqy.b $$0) {
      fom.a $$1 = this.i.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      fom.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, eqa $$1, frc $$2, List<fqy.b> $$3) {
      ehh $$4 = $$1.b();
      if (this.e && (this.f == null || this.f.isDone())) {
         this.a($$0, $$1, $$4);
      }

      this.a($$0, $$2, $$3, $$4);
   }

   private void a(boolean $$0, eqa $$1, ehh $$2) {
      this.e = false;
      this.f = ac.f().submit(() -> {
         fom.b $$3 = new fom.b(this.g.f.length);
         this.i.set($$3.b);
         Queue<fom.d> $$4 = Queues.newArrayDeque();
         this.a($$1, $$4);
         $$4.forEach($$1xx -> $$3.a.a.a($$1xx.a, $$1xx));
         this.a($$3.a, $$2, $$4, $$0, $$0xx -> {
         });
         this.h.set($$3);
         this.i.set(null);
         this.j.set(true);
      });
   }

   private void a(boolean $$0, frc $$1, List<fqy.b> $$2, ehh $$3) {
      fom.b $$4 = this.h.get();
      this.a($$4);
      if (!$$4.b.b.isEmpty()) {
         Queue<fom.d> $$5 = Queues.newArrayDeque();

         while (!$$4.b.b.isEmpty()) {
            fqy.b $$6 = $$4.b.b.poll();
            fom.d $$7 = $$4.a.a.a($$6);
            if ($$7 != null && $$7.a == $$6) {
               $$5.add($$7);
            }
         }

         frc $$8 = fny.a($$1);
         Consumer<fqy.b> $$9 = $$2x -> {
            if ($$8.a($$2x.b())) {
               $$2.add($$2x);
            }
         };
         this.a($$4.a, $$3, $$5, $$0, $$9);
      }
   }

   private void a(fom.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<fqy.b> $$3 = (List<fqy.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(fom.a $$0, cpi $$1) {
      $$0.a.add(cpi.c($$1.e - 1, $$1.f));
      $$0.a.add(cpi.c($$1.e, $$1.f - 1));
      $$0.a.add(cpi.c($$1.e + 1, $$1.f));
      $$0.a.add(cpi.c($$1.e, $$1.f + 1));
   }

   private void a(eqa $$0, Queue<fom.d> $$1) {
      int $$2 = 16;
      ehh $$3 = $$0.b();
      gw $$4 = $$0.c();
      fqy.b $$5 = this.g.a($$4);
      if ($$5 == null) {
         cqd $$6 = this.g.c();
         boolean $$7 = $$4.v() > $$6.H_();
         int $$8 = $$7 ? $$6.aj() - 8 : $$6.H_() + 8;
         int $$9 = asb.a($$3.c / 16.0) * 16;
         int $$10 = asb.a($$3.e / 16.0) * 16;
         int $$11 = this.g.b();
         List<fom.d> $$12 = Lists.newArrayList();

         for (int $$13 = -$$11; $$13 <= $$11; $$13++) {
            for (int $$14 = -$$11; $$14 <= $$11; $$14++) {
               fqy.b $$15 = this.g.a(new gw($$9 + hw.a($$13, 8), $$8, $$10 + hw.a($$14, 8)));
               if ($$15 != null && this.a($$4, $$15.f())) {
                  ha $$16 = $$7 ? ha.a : ha.b;
                  fom.d $$17 = new fom.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, ha.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, ha.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, ha.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, ha.c);
                  }

                  $$12.add($$17);
               }
            }
         }

         $$12.sort(Comparator.comparingDouble($$1x -> $$4.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$12);
      } else {
         $$1.add(new fom.d($$5, null, 0));
      }
   }

   private void a(fom.c $$0, ehh $$1, Queue<fom.d> $$2, boolean $$3, Consumer<fqy.b> $$4) {
      int $$5 = 16;
      gw $$6 = new gw(asb.a($$1.c / 16.0) * 16, asb.a($$1.d / 16.0) * 16, asb.a($$1.e / 16.0) * 16);
      gw $$7 = $$6.b(8, 8, 8);

      while (!$$2.isEmpty()) {
         fom.d $$8 = $$2.poll();
         fqy.b $$9 = $$8.a;
         if ($$0.b.add($$8)) {
            $$4.accept($$8.a);
         }

         boolean $$10 = Math.abs($$9.f().u() - $$6.u()) > 60 || Math.abs($$9.f().v() - $$6.v()) > 60 || Math.abs($$9.f().w() - $$6.w()) > 60;

         for (ha $$11 : b) {
            fqy.b $$12 = this.a($$6, $$9, $$11);
            if ($$12 != null && (!$$3 || !$$8.a($$11.g()))) {
               if ($$3 && $$8.a()) {
                  fqy.a $$13 = $$9.d();
                  boolean $$14 = false;

                  for (int $$15 = 0; $$15 < b.length; $$15++) {
                     if ($$8.a($$15) && $$13.a(b[$$15].g(), $$11)) {
                        $$14 = true;
                        break;
                     }
                  }

                  if (!$$14) {
                     continue;
                  }
               }

               if ($$3 && $$10) {
                  gw $$16 = $$12.f();
                  gw $$17 = $$16.b(
                     ($$11.o() == ha.a.a ? $$7.u() <= $$16.u() : $$7.u() >= $$16.u()) ? 0 : 16,
                     ($$11.o() == ha.a.b ? $$7.v() <= $$16.v() : $$7.v() >= $$16.v()) ? 0 : 16,
                     ($$11.o() == ha.a.c ? $$7.w() <= $$16.w() : $$7.w() >= $$16.w()) ? 0 : 16
                  );
                  ehh $$18 = new ehh((double)$$17.u(), (double)$$17.v(), (double)$$17.w());
                  ehh $$19 = $$1.d($$18).d().a(d);
                  boolean $$20 = true;

                  while ($$1.d($$18).g() > 3600.0) {
                     $$18 = $$18.e($$19);
                     cqd $$21 = this.g.c();
                     if ($$18.d > (double)$$21.aj() || $$18.d < (double)$$21.H_()) {
                        break;
                     }

                     fqy.b $$22 = this.g.a(gw.a($$18.c, $$18.d, $$18.e));
                     if ($$22 == null || $$0.a.a($$22) == null) {
                        $$20 = false;
                        break;
                     }
                  }

                  if (!$$20) {
                     continue;
                  }
               }

               fom.d $$23 = $$0.a.a($$12);
               if ($$23 != null) {
                  $$23.b($$11);
               } else {
                  fom.d $$24 = new fom.d($$12, $$11, $$8.b + 1);
                  $$24.a($$8.d, $$11);
                  if ($$12.a()) {
                     $$2.add($$24);
                     $$0.a.a($$12, $$24);
                  } else if (this.a($$6, $$12.f())) {
                     $$0.a.a($$12, $$24);
                     ((List)$$0.c.computeIfAbsent(cpi.a($$12.f()), $$0x -> new ArrayList())).add($$12);
                  }
               }
            }
         }
      }
   }

   private boolean a(gw $$0, gw $$1) {
      int $$2 = hw.a($$0.u());
      int $$3 = hw.a($$0.w());
      int $$4 = hw.a($$1.u());
      int $$5 = hw.a($$1.w());
      return akh.a($$2, $$3, this.g.b(), $$4, $$5);
   }

   @Nullable
   private fqy.b a(gw $$0, fqy.b $$1, ha $$2) {
      gw $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return asb.a($$0.v() - $$3.v()) > this.g.b() * 16 ? null : this.g.a($$3);
      }
   }

   @Nullable
   @atd
   protected fom.d b(fqy.b $$0) {
      return this.h.get().a.a.a($$0);
   }

   static record a(LongSet a, BlockingQueue<fqy.b> b) {

      public a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(fom.c a, fom.a b) {

      public b(int $$0) {
         this(new fom.c($$0), new fom.a());
      }
   }

   static class c {
      public final fom.e a;
      public final LinkedHashSet<fom.d> b;
      public final Long2ObjectMap<List<fqy.b>> c;

      public c(int $$0) {
         this.a = new fom.e($$0);
         this.b = new LinkedHashSet<>($$0);
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @atd
   protected static class d {
      @atd
      protected final fqy.b a;
      private byte c;
      byte d;
      @atd
      protected final int b;

      d(fqy.b $$0, @Nullable ha $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, ha $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(ha $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(ha $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @atd
      protected boolean a(int $$0) {
         return (this.c & 1 << $$0) > 0;
      }

      boolean a() {
         return this.c != 0;
      }

      @Override
      public int hashCode() {
         return this.a.f().hashCode();
      }

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof fom.d $$1) ? false : this.a.f().equals($$1.a.f());
      }
   }

   static class e {
      private final fom.d[] a;

      e(int $$0) {
         this.a = new fom.d[$$0];
      }

      public void a(fqy.b $$0, fom.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public fom.d a(fqy.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
