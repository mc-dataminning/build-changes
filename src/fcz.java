import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fcz extends eyk {
   private final Consumer<Optional<cpr>> a;
   private fcz.g b;
   private final Set<fcz.f> c = Sets.newHashSet();
   private esq k;
   @Nullable
   private List<arj> l;
   private final cpr m;

   public fcz(cpr $$0, Consumer<Optional<cpr>> $$1) {
      super(tl.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aH_() {
      this.b = new fcz.g(this.m);
      this.e(this.b);
      evy.b $$0 = new evy().a(10).d(2);
      this.k = $$0.a(esq.a(tk.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(esq.a(tk.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         eso var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void az_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fcz.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fcz.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fcz.d {
      private final esx<Boolean> d;

      public a(tl $$1, List<arj> $$2, String $$3, cpr.a $$4) {
         super($$2, $$1);
         this.d = esx.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fcz.f {
      final tl b;

      public b(tl $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fcz.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends euk> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends ewg> b() {
         return ImmutableList.of(new ewg() {
            @Override
            public ewg.a q() {
               return ewg.a.b;
            }

            @Override
            public void b(ewi $$0) {
               $$0.a(ewh.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cpr.g<T>> {
      fcz.f create(tl var1, List<arj> var2, String var3, T var4);
   }

   public abstract class d extends fcz.f {
      private final List<arj> a;
      protected final List<eso> b = Lists.newArrayList();

      public d(@Nullable List<arj> $$1, tl $$2) {
         super($$1);
         this.a = fcz.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends euk> i() {
         return this.b;
      }

      @Override
      public List<? extends ewg> b() {
         return this.b;
      }

      protected void a(esf $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fcz.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fcz.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fcz.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fcz.d {
      private final esz d;

      public e(tl $$1, List<arj> $$2, String $$3, cpr.d $$4) {
         super($$2, $$1);
         this.d = new esz(fcz.this.f.h, 10, 5, 44, 20, $$1.e().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fcz.this.b(this);
            } else {
               this.d.m(16711680);
               fcz.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends esw.a<fcz.f> {
      @Nullable
      final List<arj> a;

      public f(@Nullable List<arj> $$0) {
         this.a = $$0;
      }
   }

   public class g extends esw<fcz.f> {
      public g(final cpr $$1) {
         super(fcz.this.f, fcz.this.g, fcz.this.h, 43, fcz.this.h - 32, 24);
         final Map<cpr.b, Map<cpr.e<?>, fcz.f>> $$2 = Maps.newHashMap();
         cpr.a(new cpr.c() {
            @Override
            public void b(cpr.e<cpr.a> $$0, cpr.f<cpr.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcz.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cpr.e<cpr.d> $$0, cpr.f<cpr.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcz.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cpr.g<T>> void a(cpr.e<T> $$0, fcz.c<T> $$1x) {
               tl $$2 = tl.c($$0.b());
               tl $$3 = tl.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               tl $$6 = tl.a("editGamerule.default", tl.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<arj> $$10;
               String $$11;
               if (gak.a($$7)) {
                  Builder<arj> $$8 = ImmutableList.builder().add($$3.f());
                  tl $$9 = tl.c($$7);
                  fcz.this.i.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.f()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.f(), $$6.f());
                  $$11 = $$6.getString();
               }

               $$2.computeIfAbsent($$0.c(), $$0x -> Maps.newHashMap()).put($$0, $$1.create($$2, $$10, $$11, $$4));
            }
         });
         $$2.entrySet()
            .stream()
            .sorted(Entry.comparingByKey())
            .forEach(
               $$0x -> {
                  this.b(fcz.this.new b(tl.c(((cpr.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cpr.e::a)))
                     .forEach($$0xx -> this.b((fcz.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fcz.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fcz.this.b($$4.a);
         }
      }
   }
}
