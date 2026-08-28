import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ftx extends ftg<ftx.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final gby n;

   public ftx(fpt $$0, int $$1, gby $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fpw<?> $$0) {
      this.b(ftx.b.a(this.c.n, $$0, this.n));
   }

   public void a(fpw<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fpw<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(ftx.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fsy> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fsy $$0, @Nullable fsy $$1) {
      this.b(ftx.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fsy b(fpw<?> $$0) {
      for (ftx.a $$1 : this.aE_()) {
         if ($$1 instanceof ftx.b $$2) {
            fsy $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (ftx.a $$0 : this.aE_()) {
         if ($$0 instanceof ftx.b) {
            ftx.b $$1 = (ftx.b)$$0;

            for (fsy $$2 : $$1.a.values()) {
               if ($$2 instanceof fpw.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fux> e(double $$0, double $$1) {
      for (ftx.a $$2 : this.aE_()) {
         for (fux $$3 : $$2.aE_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends ftg.a<ftx.a> {
      private final List<fsy> a;
      private final fys b;
      private static final int c = 160;

      a(List<fsy> $$0, fys $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static ftx.a a(List<fsy> $$0, fys $$1) {
         return new ftx.a($$0, $$1);
      }

      public static ftx.a a(fsy $$0, @Nullable fsy $$1, fys $$2) {
         return $$1 == null ? new ftx.a(ImmutableList.of($$0), $$2) : new ftx.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fsy $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fux> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fwv> b() {
         return this.a;
      }
   }

   protected static class b extends ftx.a {
      final Map<fpw<?>, fsy> a;

      private b(Map<fpw<?>, fsy> $$0, gby $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static ftx.b a(fpx $$0, fpw<?> $$1, gby $$2) {
         return new ftx.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static ftx.b a(fpx $$0, fpw<?> $$1, @Nullable fpw<?> $$2, gby $$3) {
         fsy $$4 = $$1.a($$0);
         return $$2 == null ? new ftx.b(ImmutableMap.of($$1, $$4), $$3) : new ftx.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
