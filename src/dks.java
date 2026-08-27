import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dks extends djl implements dqt.b<dra.b>, dra {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<ato> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, atp.Bj);
      $$0.put(2, atp.Bk);
      $$0.put(3, atp.Bl);
      $$0.put(4, atp.Bi);
   });
   private int l;
   private final dra.d m = new dks.a();
   private dra.a n = new dra.a();
   private final dra.b r = new dra.b(this);

   public dks(ib $$0, dme $$1) {
      super(djn.L, $$0, $$1);
   }

   @Override
   public dra.a gn() {
      return this.n;
   }

   @Override
   public dra.d go() {
      return this.m;
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dra.a.a.parse(new Dynamic(tm.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dra.a.a.encodeStart(tm.a, this.n).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static apb a(@Nullable bof $$0) {
      if ($$0 instanceof apb) {
         return (apb)$$0;
      } else {
         if ($$0 != null) {
            box $$6 = $$0.cK();
            if ($$6 instanceof apb) {
               return (apb)$$6;
            }
         }

         if ($$0 instanceof cis $$3) {
            bof var3 = $$3.w();
            if (var3 instanceof apb) {
               return (apb)var3;
            }
         }

         if ($$0 instanceof cel $$5) {
            bof var9 = $$5.w();
            if (var9 instanceof apb) {
               return (apb)var9;
            }
         }

         return null;
      }
   }

   public void a(apa $$0, @Nullable apb $$1) {
      if ($$1 != null) {
         dme $$2 = this.n();
         if (!$$2.c(dfy.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bof)$$1);
            }
         }
      }
   }

   private boolean b(apa $$0, apb $$1) {
      OptionalInt $$2 = chg.a($$0, this.aD_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(apa $$0, @Nullable bof $$1) {
      ib $$2 = this.aD_();
      dme $$3 = this.n();
      $$0.a($$2, $$3.a(dfy.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dqr.N, $$2, dqr.a.a($$1));
   }

   private boolean b(apa $$0) {
      return this.n().c(dfy.d) && $$0.aj() != bmi.a && $$0.Z().b(cwa.M);
   }

   public void a(apa $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((cwe)$$0);
         }

         che.a($$0, eov.b(this.aD_()), null, 40);
      }
   }

   private void b(cwe $$0) {
      ato $$1 = (ato)k.get(this.l);
      if ($$1 != null) {
         ib $$2 = this.aD_();
         int $$3 = $$2.u() + awm.b($$0.z, -10, 10);
         int $$4 = $$2.v() + awm.b($$0.z, -10, 10);
         int $$5 = $$2.w() + awm.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, atq.f, 5.0F, 1.0F);
      }
   }

   private boolean c(apa $$0) {
      return this.l < 4 ? false : axe.a(bol.bk, bpb.k, $$0, this.aD_(), 20, 5, 6, axe.a.b).isPresent();
   }

   public dra.b b() {
      return this.r;
   }

   class a implements dra.d {
      private static final int b = 8;
      private final dqv c = new dqn(dks.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dqv b() {
         return this.c;
      }

      @Override
      public aut<dqr> c() {
         return auk.c;
      }

      @Override
      public boolean a(apa $$0, ib $$1, il<dqr> $$2, dqr.a $$3) {
         return !dks.this.n().c(dfy.b) && dks.a($$3.a()) != null;
      }

      @Override
      public void a(apa $$0, ib $$1, il<dqr> $$2, @Nullable bof $$3, @Nullable bof $$4, float $$5) {
         dks.this.a($$0, dks.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dks.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
