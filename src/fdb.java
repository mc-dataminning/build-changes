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

public class fdb extends eym {
   private final Consumer<Optional<cpt>> a;
   private fdb.g b;
   private final Set<fdb.f> c = Sets.newHashSet();
   private ess k;
   @Nullable
   private List<arl> l;
   private final cpt m;

   public fdb(cpt $$0, Consumer<Optional<cpt>> $$1) {
      super(tn.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aH_() {
      this.b = new fdb.g(this.m);
      this.e(this.b);
      ewa.b $$0 = new ewa().a(10).d(2);
      this.k = $$0.a(ess.a(tm.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(ess.a(tm.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         esq var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void az_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fdb.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fdb.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fdb.d {
      private final esz<Boolean> d;

      public a(tn $$1, List<arl> $$2, String $$3, cpt.a $$4) {
         super($$2, $$1);
         this.d = esz.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fdb.f {
      final tn b;

      public b(tn $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fdb.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends eum> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends ewi> b() {
         return ImmutableList.of(new ewi() {
            @Override
            public ewi.a q() {
               return ewi.a.b;
            }

            @Override
            public void b(ewk $$0) {
               $$0.a(ewj.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cpt.g<T>> {
      fdb.f create(tn var1, List<arl> var2, String var3, T var4);
   }

   public abstract class d extends fdb.f {
      private final List<arl> a;
      protected final List<esq> b = Lists.newArrayList();

      public d(@Nullable List<arl> $$1, tn $$2) {
         super($$1);
         this.a = fdb.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends eum> i() {
         return this.b;
      }

      @Override
      public List<? extends ewi> b() {
         return this.b;
      }

      protected void a(esh $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fdb.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fdb.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fdb.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fdb.d {
      private final etb d;

      public e(tn $$1, List<arl> $$2, String $$3, cpt.d $$4) {
         super($$2, $$1);
         this.d = new etb(fdb.this.f.h, 10, 5, 44, 20, $$1.e().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fdb.this.b(this);
            } else {
               this.d.m(16711680);
               fdb.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends esy.a<fdb.f> {
      @Nullable
      final List<arl> a;

      public f(@Nullable List<arl> $$0) {
         this.a = $$0;
      }
   }

   public class g extends esy<fdb.f> {
      public g(final cpt $$1) {
         super(fdb.this.f, fdb.this.g, fdb.this.h, 43, fdb.this.h - 32, 24);
         final Map<cpt.b, Map<cpt.e<?>, fdb.f>> $$2 = Maps.newHashMap();
         cpt.a(new cpt.c() {
            @Override
            public void b(cpt.e<cpt.a> $$0, cpt.f<cpt.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fdb.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cpt.e<cpt.d> $$0, cpt.f<cpt.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fdb.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cpt.g<T>> void a(cpt.e<T> $$0, fdb.c<T> $$1x) {
               tn $$2 = tn.c($$0.b());
               tn $$3 = tn.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               tn $$6 = tn.a("editGamerule.default", tn.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<arl> $$10;
               String $$11;
               if (gam.a($$7)) {
                  Builder<arl> $$8 = ImmutableList.builder().add($$3.f());
                  tn $$9 = tn.c($$7);
                  fdb.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fdb.this.new b(tn.c(((cpt.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cpt.e::a)))
                     .forEach($$0xx -> this.b((fdb.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fdb.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fdb.this.b($$4.a);
         }
      }
   }
}
