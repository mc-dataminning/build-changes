import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cpb {
   public static final zc<wp, cpb> a = new zc<wp, cpb>() {
      public cpb a(wp $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         int $$3 = $$0.l();
         List<dtc> $$4 = $$0.a($$0x -> dfc.a($$0x.l()));
         int $$5 = aym.e($$4.size());
         dtc[] $$6 = new dtc[$$1 * $$2 * $$3];
         aza $$7 = new aza($$5, $$6.length, $$0.d());

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$6[$$8] = $$4.get($$7.a($$8));
         }

         ArrayList<ir> $$9 = $$0.a(ArrayList::new, ir.b);
         return new cpb($$6, $$9, $$1, $$2, $$3);
      }

      public void a(wp $$0, cpb $$1) {
         $$0.c($$1.f);
         $$0.c($$1.g);
         $$0.c($$1.h);
         Reference2IntMap<dtc> $$2 = new Reference2IntOpenHashMap();
         List<dtc> $$3 = new ArrayList<>();
         $$2.defaultReturnValue(-1);

         for (dtc $$4 : $$1.d) {
            int $$5 = $$3.size();
            int $$6 = $$2.putIfAbsent($$4, $$5);
            if ($$6 == -1) {
               $$3.add($$4);
            }
         }

         $$0.a($$3, ($$0x, $$1x) -> $$0x.c(dfc.i($$1x)));
         int $$7 = aym.e($$3.size());
         axb $$8 = new aza($$7, $$1.f * $$1.g * $$1.h);
         int $$9 = 0;

         for (dtc $$10 : $$1.d) {
            $$8.b($$9++, $$2.getInt($$10));
         }

         $$0.a($$8.a());
         $$0.a($$1.e, ir.b);
      }
   };
   private static final int b = -1;
   private static final dtc c = dfe.a.n();
   final dtc[] d;
   final List<ir> e;
   final int f;
   final int g;
   final int h;

   cpb(dtc[] $$0, List<ir> $$1, int $$2, int $$3, int $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cpb(int $$0, int $$1, int $$2) {
      this.d = new dtc[$$0 * $$1 * $$2];
      Arrays.fill(this.d, c);
      this.e = new ArrayList<>();
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public void a(int $$0, int $$1, int $$2, dtc $$3) {
      int $$4 = this.b($$0, $$1, $$2);
      if ($$4 == -1) {
         throw new IllegalStateException("Block was out of bounds");
      } else {
         this.d[$$4] = $$3;
      }
   }

   public void a(ir $$0) {
      this.e.add($$0);
   }

   public void a(dca $$0, ewu $$1, iw $$2) {
      this.e.forEach($$3 -> {
         dtc $$4 = this.a($$3.u(), $$3.v(), $$3.w());
         if ($$4.b() instanceof coy $$6) {
            $$6.a($$0, this, $$4, $$3, $$1.b((double)$$3.u(), (double)$$3.v(), (double)$$3.w()), $$2);
         }
      });
   }

   public dtc a(int $$0, int $$1, int $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      return $$3 == -1 ? c : this.d[$$3];
   }

   public dtc b(ir $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   private int b(int $$0, int $$1, int $$2) {
      return $$0 >= 0 && $$1 >= 0 && $$2 >= 0 && $$0 < this.f && $$1 < this.g && $$2 < this.h ? ($$0 + $$2 * this.f) * this.g + $$1 : -1;
   }

   public int a() {
      return this.f;
   }

   public int b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public cpb d() {
      return new cpb(Arrays.copyOf(this.d, this.d.length), new ArrayList<>(this.e), this.f, this.g, this.h);
   }

   public void a(ir $$0, dca $$1) {
      ir.a $$2 = new ir.a();

      for (int $$3 = 0; $$3 < this.h; $$3++) {
         for (int $$4 = 0; $$4 < this.f; $$4++) {
            for (int $$5 = 0; $$5 < this.g; $$5++) {
               $$2.a($$0, $$4, $$5, $$3);
               dtc $$6 = this.a($$4, $$5, $$3);
               if (!$$6.i()) {
                  epe $$7 = $$1.b_($$2);
                  if ($$7.b(epf.c)) {
                     $$6 = $$6.b(dts.C, Boolean.valueOf(true));
                  }

                  $$1.a($$2, $$6, 18);
               }
            }
         }
      }

      for (int $$8 = 0; $$8 < this.h; $$8++) {
         for (int $$9 = 0; $$9 < this.f; $$9++) {
            for (int $$10 = 0; $$10 < this.g; $$10++) {
               $$2.a($$0, $$9, $$10, $$8);
               $$1.b($$2, this.a($$9, $$10, $$8).b());
            }
         }
      }
   }

   public static cpb a(jb<dfc> $$0, uk $$1) {
      int $$2 = $$1.h("size_x");
      int $$3 = $$1.h("size_y");
      int $$4 = $$1.h("size_z");
      dtc[] $$5 = new dtc[$$2 * $$3 * $$4];
      uq $$6 = $$1.c("palette", 10);
      List<dtc> $$7 = new ArrayList<>();

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         $$7.add(uz.a($$0, $$6.a($$8)));
      }

      int[] $$9 = $$1.n("blocks");
      if ($$9.length != $$5.length) {
         return new cpb($$2, $$3, $$4);
      } else {
         for (int $$10 = 0; $$10 < $$9.length; $$10++) {
            int $$11 = $$9[$$10];
            $$5[$$10] = $$11 < $$7.size() ? $$7.get($$11) : dfe.a.n();
         }

         List<ir> $$12 = new ArrayList<>();
         if ($$1.b("tickables", 12)) {
            Arrays.stream($$1.o("tickables")).mapToObj(ir::d).forEach($$12::add);
         }

         return new cpb($$5, $$12, $$2, $$3, $$4);
      }
   }

   public vh e() {
      uk $$0 = new uk();
      $$0.a("size_x", this.f);
      $$0.a("size_y", this.g);
      $$0.a("size_z", this.h);
      Reference2IntMap<dtc> $$1 = new Reference2IntOpenHashMap();
      $$1.defaultReturnValue(-1);
      uq $$2 = new uq();
      int[] $$3 = new int[this.d.length];

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         dtc $$5 = this.d[$$4];
         int $$6 = $$2.size();
         int $$7 = $$1.putIfAbsent($$5, $$6);
         if ($$7 == -1) {
            $$2.add(uz.a($$5));
            $$3[$$4] = $$6;
         } else {
            $$3[$$4] = $$7;
         }
      }

      $$0.a("palette", $$2);
      $$0.a("blocks", new uo($$3));
      $$0.a("tickables", this.e.stream().mapToLong(ir::a).toArray());
      return $$0;
   }
}
