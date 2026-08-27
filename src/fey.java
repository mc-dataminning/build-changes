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

public class fey extends fah {
   private final Consumer<Optional<cro>> a;
   private fey.g b;
   private final Set<fey.f> c = Sets.newHashSet();
   private eum k;
   @Nullable
   private List<asu> l;
   private final cro m;

   public fey(cro $$0, Consumer<Optional<cro>> $$1) {
      super(ur.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aO_() {
      this.b = new fey.g(this.m);
      this.e(this.b);
      exv.b $$0 = new exv().a(10).d(2);
      this.k = $$0.a(eum.a(uq.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(eum.a(uq.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         euk var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void aE_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fey.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fey.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fey.d {
      private final eut<Boolean> d;

      public a(ur $$1, List<asu> $$2, String $$3, cro.a $$4) {
         super($$2, $$1);
         this.d = eut.b($$4.a()).a().a($$1x -> $$1x.e().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fey.f {
      final ur b;

      public b(ur $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fey.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends ewh> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends eyd> b() {
         return ImmutableList.of(new eyd() {
            @Override
            public eyd.a q() {
               return eyd.a.b;
            }

            @Override
            public void b(eyf $$0) {
               $$0.a(eye.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cro.g<T>> {
      fey.f create(ur var1, List<asu> var2, String var3, T var4);
   }

   public abstract class d extends fey.f {
      private final List<asu> a;
      protected final List<euk> b = Lists.newArrayList();

      public d(@Nullable List<asu> $$1, ur $$2) {
         super($$1);
         this.a = fey.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends ewh> i() {
         return this.b;
      }

      @Override
      public List<? extends eyd> b() {
         return this.b;
      }

      protected void a(eub $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fey.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fey.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fey.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fey.d {
      private final euv d;

      public e(ur $$1, List<asu> $$2, String $$3, cro.d $$4) {
         super($$2, $$1);
         this.d = new euv(fey.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fey.this.b(this);
            } else {
               this.d.m(16711680);
               fey.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends eus.a<fey.f> {
      @Nullable
      final List<asu> a;

      public f(@Nullable List<asu> $$0) {
         this.a = $$0;
      }
   }

   public class g extends eus<fey.f> {
      public g(final cro $$1) {
         super(fey.this.f, fey.this.g, fey.this.h, 43, fey.this.h - 32, 24);
         final Map<cro.b, Map<cro.e<?>, fey.f>> $$2 = Maps.newHashMap();
         cro.a(new cro.c() {
            @Override
            public void b(cro.e<cro.a> $$0, cro.f<cro.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fey.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cro.e<cro.d> $$0, cro.f<cro.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fey.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cro.g<T>> void a(cro.e<T> $$0, fey.c<T> $$1x) {
               ur $$2 = ur.c($$0.b());
               ur $$3 = ur.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               ur $$6 = ur.a("editGamerule.default", ur.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<asu> $$10;
               String $$11;
               if (gcn.a($$7)) {
                  Builder<asu> $$8 = ImmutableList.builder().add($$3.g());
                  ur $$9 = ur.c($$7);
                  fey.this.i.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.g()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.g(), $$6.g());
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
                  this.b(fey.this.new b(ur.c(((cro.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cro.e::a)))
                     .forEach($$0xx -> this.b((fey.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fey.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fey.this.b($$4.a);
         }
      }
   }
}
