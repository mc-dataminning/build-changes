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

public class fpn {
   private static final Logger a = LogUtils.getLogger();
   private static final hx[] b = hx.values();
   private static final int c = 60;
   private static final double d = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean e = true;
   @Nullable
   private Future<?> f;
   @Nullable
   private fpr g;
   private final AtomicReference<fpn.b> h = new AtomicReference<>();
   private final AtomicReference<fpn.a> i = new AtomicReference<>();
   private final AtomicBoolean j = new AtomicBoolean(false);

   public void a(@Nullable fpr $$0) {
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
         this.h.set(new fpn.b($$0.f.length));
         this.a();
      } else {
         this.h.set(null);
      }
   }

   public void a() {
      this.e = true;
   }

   public void a(fsc $$0, List<fry.b> $$1) {
      for (fpn.d $$2 : this.h.get().a().b) {
         if ($$0.a($$2.a.b())) {
            $$1.add($$2.a);
         }
      }
   }

   public boolean b() {
      return this.j.compareAndSet(true, false);
   }

   public void a(cqg $$0) {
      fpn.a $$1 = this.i.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      fpn.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(fry.b $$0) {
      fpn.a $$1 = this.i.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      fpn.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, eqz $$1, fsc $$2, List<fry.b> $$3) {
      eif $$4 = $$1.b();
      if (this.e && (this.f == null || this.f.isDone())) {
         this.a($$0, $$1, $$4);
      }

      this.a($$0, $$2, $$3, $$4);
   }

   private void a(boolean $$0, eqz $$1, eif $$2) {
      this.e = false;
      this.f = ac.f().submit(() -> {
         fpn.b $$3 = new fpn.b(this.g.f.length);
         this.i.set($$3.b);
         Queue<fpn.d> $$4 = Queues.newArrayDeque();
         this.a($$1, $$4);
         $$4.forEach($$1xx -> $$3.a.a.a($$1xx.a, $$1xx));
         this.a($$3.a, $$2, $$4, $$0, $$0xx -> {
         });
         this.h.set($$3);
         this.i.set(null);
         this.j.set(true);
      });
   }

   private void a(boolean $$0, fsc $$1, List<fry.b> $$2, eif $$3) {
      fpn.b $$4 = this.h.get();
      this.a($$4);
      if (!$$4.b.b.isEmpty()) {
         Queue<fpn.d> $$5 = Queues.newArrayDeque();

         while (!$$4.b.b.isEmpty()) {
            fry.b $$6 = $$4.b.b.poll();
            fpn.d $$7 = $$4.a.a.a($$6);
            if ($$7 != null && $$7.a == $$6) {
               $$5.add($$7);
            }
         }

         fsc $$8 = foz.a($$1);
         Consumer<fry.b> $$9 = $$2x -> {
            if ($$8.a($$2x.b())) {
               $$2.add($$2x);
            }
         };
         this.a($$4.a, $$3, $$5, $$0, $$9);
      }
   }

   private void a(fpn.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<fry.b> $$3 = (List<fry.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(fpn.a $$0, cqg $$1) {
      $$0.a.add(cqg.c($$1.e - 1, $$1.f));
      $$0.a.add(cqg.c($$1.e, $$1.f - 1));
      $$0.a.add(cqg.c($$1.e + 1, $$1.f));
      $$0.a.add(cqg.c($$1.e, $$1.f + 1));
   }

   private void a(eqz $$0, Queue<fpn.d> $$1) {
      int $$2 = 16;
      eif $$3 = $$0.b();
      ht $$4 = $$0.c();
      fry.b $$5 = this.g.a($$4);
      if ($$5 == null) {
         crb $$6 = this.g.c();
         boolean $$7 = $$4.v() > $$6.I_();
         int $$8 = $$7 ? $$6.aj() - 8 : $$6.I_() + 8;
         int $$9 = asy.a($$3.c / 16.0) * 16;
         int $$10 = asy.a($$3.e / 16.0) * 16;
         int $$11 = this.g.b();
         List<fpn.d> $$12 = Lists.newArrayList();

         for (int $$13 = -$$11; $$13 <= $$11; $$13++) {
            for (int $$14 = -$$11; $$14 <= $$11; $$14++) {
               fry.b $$15 = this.g.a(new ht($$9 + iu.a($$13, 8), $$8, $$10 + iu.a($$14, 8)));
               if ($$15 != null && this.a($$4, $$15.f())) {
                  hx $$16 = $$7 ? hx.a : hx.b;
                  fpn.d $$17 = new fpn.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, hx.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, hx.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, hx.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, hx.c);
                  }

                  $$12.add($$17);
               }
            }
         }

         $$12.sort(Comparator.comparingDouble($$1x -> $$4.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$12);
      } else {
         $$1.add(new fpn.d($$5, null, 0));
      }
   }

   private void a(fpn.c $$0, eif $$1, Queue<fpn.d> $$2, boolean $$3, Consumer<fry.b> $$4) {
      int $$5 = 16;
      ht $$6 = new ht(asy.a($$1.c / 16.0) * 16, asy.a($$1.d / 16.0) * 16, asy.a($$1.e / 16.0) * 16);
      ht $$7 = $$6.b(8, 8, 8);

      while (!$$2.isEmpty()) {
         fpn.d $$8 = $$2.poll();
         fry.b $$9 = $$8.a;
         if ($$0.b.add($$8)) {
            $$4.accept($$8.a);
         }

         boolean $$10 = Math.abs($$9.f().u() - $$6.u()) > 60 || Math.abs($$9.f().v() - $$6.v()) > 60 || Math.abs($$9.f().w() - $$6.w()) > 60;

         for (hx $$11 : b) {
            fry.b $$12 = this.a($$6, $$9, $$11);
            if ($$12 != null && (!$$3 || !$$8.a($$11.g()))) {
               if ($$3 && $$8.a()) {
                  fry.a $$13 = $$9.d();
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
                  ht $$16 = $$12.f();
                  ht $$17 = $$16.b(
                     ($$11.o() == hx.a.a ? $$7.u() <= $$16.u() : $$7.u() >= $$16.u()) ? 0 : 16,
                     ($$11.o() == hx.a.b ? $$7.v() <= $$16.v() : $$7.v() >= $$16.v()) ? 0 : 16,
                     ($$11.o() == hx.a.c ? $$7.w() <= $$16.w() : $$7.w() >= $$16.w()) ? 0 : 16
                  );
                  eif $$18 = new eif((double)$$17.u(), (double)$$17.v(), (double)$$17.w());
                  eif $$19 = $$1.d($$18).d().a(d);
                  boolean $$20 = true;

                  while ($$1.d($$18).g() > 3600.0) {
                     $$18 = $$18.e($$19);
                     crb $$21 = this.g.c();
                     if ($$18.d > (double)$$21.aj() || $$18.d < (double)$$21.I_()) {
                        break;
                     }

                     fry.b $$22 = this.g.a(ht.a($$18.c, $$18.d, $$18.e));
                     if ($$22 == null || $$0.a.a($$22) == null) {
                        $$20 = false;
                        break;
                     }
                  }

                  if (!$$20) {
                     continue;
                  }
               }

               fpn.d $$23 = $$0.a.a($$12);
               if ($$23 != null) {
                  $$23.b($$11);
               } else {
                  fpn.d $$24 = new fpn.d($$12, $$11, $$8.b + 1);
                  $$24.a($$8.d, $$11);
                  if ($$12.a()) {
                     $$2.add($$24);
                     $$0.a.a($$12, $$24);
                  } else if (this.a($$6, $$12.f())) {
                     $$0.a.a($$12, $$24);
                     ((List)$$0.c.computeIfAbsent(cqg.a($$12.f()), $$0x -> new ArrayList())).add($$12);
                  }
               }
            }
         }
      }
   }

   private boolean a(ht $$0, ht $$1) {
      int $$2 = iu.a($$0.u());
      int $$3 = iu.a($$0.w());
      int $$4 = iu.a($$1.u());
      int $$5 = iu.a($$1.w());
      return ale.a($$2, $$3, this.g.b(), $$4, $$5);
   }

   @Nullable
   private fry.b a(ht $$0, fry.b $$1, hx $$2) {
      ht $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return asy.a($$0.v() - $$3.v()) > this.g.b() * 16 ? null : this.g.a($$3);
      }
   }

   @Nullable
   @aua
   protected fpn.d b(fry.b $$0) {
      return this.h.get().a.a.a($$0);
   }

   static record a(LongSet a, BlockingQueue<fry.b> b) {

      public a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(fpn.c a, fpn.a b) {

      public b(int $$0) {
         this(new fpn.c($$0), new fpn.a());
      }
   }

   static class c {
      public final fpn.e a;
      public final LinkedHashSet<fpn.d> b;
      public final Long2ObjectMap<List<fry.b>> c;

      public c(int $$0) {
         this.a = new fpn.e($$0);
         this.b = new LinkedHashSet<>($$0);
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @aua
   protected static class d {
      @aua
      protected final fry.b a;
      private byte c;
      byte d;
      @aua
      protected final int b;

      d(fry.b $$0, @Nullable hx $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, hx $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(hx $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(hx $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @aua
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
         return !($$0 instanceof fpn.d $$1) ? false : this.a.f().equals($$1.a.f());
      }
   }

   static class e {
      private final fpn.d[] a;

      e(int $$0) {
         this.a = new fpn.d[$$0];
      }

      public void a(fry.b $$0, fpn.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public fpn.d a(fry.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
