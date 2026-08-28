import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dzq extends dye implements egi.b<egp.b>, egp {
   private static final int a = 10;
   private static final int b = 20;
   private static final int c = 5;
   private static final int d = 6;
   private static final int e = 40;
   private static final int f = 90;
   private static final Int2ObjectMap<awq> j = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awr.CV);
      $$0.put(2, awr.CW);
      $$0.put(3, awr.CX);
      $$0.put(4, awr.CU);
   });
   private static final int k = 0;
   private int l = 0;
   private final egp.d m = new dzq.a();
   private egp.a q = new egp.a();
   private final egp.b r = new egp.b(this);

   public dzq(iw $$0, ebg $$1) {
      super(dyg.M, $$0, $$1);
   }

   @Override
   public egp.a x() {
      return this.q;
   }

   @Override
   public egp.d gu() {
      return this.m;
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.l = $$0.b("warning_level", 0);
      ali<va> $$2 = $$1.a(uo.a);
      this.q = $$0.<egp.a>a("listener", egp.a.a, $$2).orElseGet(egp.a::new);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      ali<va> $$2 = $$1.a(uo.a);
      $$0.a("listener", egp.a.a, $$2, this.q);
   }

   @Nullable
   public static arv a(@Nullable bwv $$0) {
      if ($$0 instanceof arv) {
         return (arv)$$0;
      } else {
         if ($$0 != null) {
            bxw $$6 = $$0.cW();
            if ($$6 instanceof arv) {
               return (arv)$$6;
            }
         }

         if ($$0 instanceof csu $$3) {
            bwv var3 = $$3.q();
            if (var3 instanceof arv) {
               return (arv)var3;
            }
         }

         if ($$0 instanceof coe $$5) {
            bwv var9 = $$5.q();
            if (var9 instanceof arv) {
               return (arv)var9;
            }
         }

         return null;
      }
   }

   public void a(aru $$0, @Nullable arv $$1) {
      if ($$1 != null) {
         ebg $$2 = this.m();
         if (!$$2.c(dug.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bwv)$$1);
            }
         }
      }
   }

   private boolean b(aru $$0, arv $$1) {
      OptionalInt $$2 = cre.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aru $$0, @Nullable bwv $$1) {
      iw $$2 = this.aB_();
      ebg $$3 = this.m();
      $$0.a($$2, $$3.b(dug.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(egg.N, $$2, egg.a.a($$1));
   }

   private boolean b(aru $$0) {
      return this.m().c(dug.d) && $$0.an() != buq.a && $$0.O().c(djv.O);
   }

   @Override
   public void a(iw $$0, ebg $$1) {
      if ($$1.c(dug.b) && this.n instanceof aru $$2) {
         this.a($$2);
      }
   }

   public void a(aru $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((djz)$$0);
         }

         crc.a($$0, ffs.b(this.aB_()), null, 40);
      }
   }

   private void b(djz $$0) {
      awq $$1 = (awq)j.get(this.l);
      if ($$1 != null) {
         iw $$2 = this.aB_();
         int $$3 = $$2.u() + azq.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azq.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azq.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aws.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aru $$0) {
      return this.l < 4 ? false : bal.a(bxe.bH, bxd.k, $$0, this.aB_(), 20, 5, 6, bal.a.b, false).isPresent();
   }

   public egp.b a() {
      return this.r;
   }

   class a implements egp.d {
      private static final int b = 8;
      private final egk c = new egc(dzq.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public egk b() {
         return this.c;
      }

      @Override
      public axv<egg> c() {
         return axm.c;
      }

      @Override
      public boolean a(aru $$0, iw $$1, jg<egg> $$2, egg.a $$3) {
         return !dzq.this.m().c(dug.b) && dzq.a($$3.a()) != null;
      }

      @Override
      public void a(aru $$0, iw $$1, jg<egg> $$2, @Nullable bwv $$3, @Nullable bwv $$4, float $$5) {
         dzq.this.a($$0, dzq.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dzq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
