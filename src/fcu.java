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

public class fcu extends eyf {
   private final Consumer<Optional<cpm>> a;
   private fcu.g b;
   private final Set<fcu.f> c = Sets.newHashSet();
   private esl k;
   @Nullable
   private List<arf> l;
   private final cpm m;

   public fcu(cpm $$0, Consumer<Optional<cpm>> $$1) {
      super(ti.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aD_() {
      this.b = new fcu.g(this.m);
      this.e(this.b);
      evt.b $$0 = new evt().a(10).d(2);
      this.k = $$0.a(esl.a(th.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(esl.a(th.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         esj var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void au_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fcu.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fcu.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fcu.d {
      private final ess<Boolean> d;

      public a(ti $$1, List<arf> $$2, String $$3, cpm.a $$4) {
         super($$2, $$1);
         this.d = ess.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fcu.f {
      final ti b;

      public b(ti $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fcu.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends euf> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends ewb> b() {
         return ImmutableList.of(new ewb() {
            @Override
            public ewb.a q() {
               return ewb.a.b;
            }

            @Override
            public void b(ewd $$0) {
               $$0.a(ewc.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cpm.g<T>> {
      fcu.f create(ti var1, List<arf> var2, String var3, T var4);
   }

   public abstract class d extends fcu.f {
      private final List<arf> a;
      protected final List<esj> b = Lists.newArrayList();

      public d(@Nullable List<arf> $$1, ti $$2) {
         super($$1);
         this.a = fcu.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends euf> i() {
         return this.b;
      }

      @Override
      public List<? extends ewb> b() {
         return this.b;
      }

      protected void a(esa $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fcu.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fcu.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fcu.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fcu.d {
      private final esu d;

      public e(ti $$1, List<arf> $$2, String $$3, cpm.d $$4) {
         super($$2, $$1);
         this.d = new esu(fcu.this.f.h, 10, 5, 44, 20, $$1.e().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fcu.this.b(this);
            } else {
               this.d.m(16711680);
               fcu.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends esr.a<fcu.f> {
      @Nullable
      final List<arf> a;

      public f(@Nullable List<arf> $$0) {
         this.a = $$0;
      }
   }

   public class g extends esr<fcu.f> {
      public g(final cpm $$1) {
         super(fcu.this.f, fcu.this.g, fcu.this.h, 43, fcu.this.h - 32, 24);
         final Map<cpm.b, Map<cpm.e<?>, fcu.f>> $$2 = Maps.newHashMap();
         cpm.a(new cpm.c() {
            @Override
            public void b(cpm.e<cpm.a> $$0, cpm.f<cpm.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcu.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cpm.e<cpm.d> $$0, cpm.f<cpm.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcu.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cpm.g<T>> void a(cpm.e<T> $$0, fcu.c<T> $$1x) {
               ti $$2 = ti.c($$0.b());
               ti $$3 = ti.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               ti $$6 = ti.a("editGamerule.default", ti.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<arf> $$10;
               String $$11;
               if (gaf.a($$7)) {
                  Builder<arf> $$8 = ImmutableList.builder().add($$3.f());
                  ti $$9 = ti.c($$7);
                  fcu.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fcu.this.new b(ti.c(((cpm.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cpm.e::a)))
                     .forEach($$0xx -> this.b((fcu.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fcu.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fcu.this.b($$4.a);
         }
      }
   }
}
