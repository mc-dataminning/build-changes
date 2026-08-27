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

public class fgt extends fcc {
   private final Consumer<Optional<csu>> a;
   private fgt.g b;
   private final Set<fgt.f> c = Sets.newHashSet();
   private ewh k;
   @Nullable
   private List<atk> l;
   private final csu m;

   public fgt(csu $$0, Consumer<Optional<csu>> $$1) {
      super(vb.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aP_() {
      this.b = new fgt.g(this.m);
      this.e(this.b);
      ezq.b $$0 = new ezq().a(10).d(2);
      this.k = $$0.a(ewh.a(va.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(ewh.a(va.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         ewf var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void aF_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fgt.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fgt.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fgt.d {
      private final ewo<Boolean> d;

      public a(vb $$1, List<atk> $$2, String $$3, csu.a $$4) {
         super($$2, $$1);
         this.d = ewo.b($$4.a()).a().a($$1x -> $$1x.e().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fgt.f {
      final vb b;

      public b(vb $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fgt.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends eyc> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends ezy> b() {
         return ImmutableList.of(new ezy() {
            @Override
            public ezy.a q() {
               return ezy.a.b;
            }

            @Override
            public void b(faa $$0) {
               $$0.a(ezz.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends csu.g<T>> {
      fgt.f create(vb var1, List<atk> var2, String var3, T var4);
   }

   public abstract class d extends fgt.f {
      private final List<atk> a;
      protected final List<ewf> b = Lists.newArrayList();

      public d(@Nullable List<atk> $$1, vb $$2) {
         super($$1);
         this.a = fgt.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends eyc> i() {
         return this.b;
      }

      @Override
      public List<? extends ezy> b() {
         return this.b;
      }

      protected void a(evw $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fgt.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fgt.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fgt.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fgt.d {
      private final ewq d;

      public e(vb $$1, List<atk> $$2, String $$3, csu.d $$4) {
         super($$2, $$1);
         this.d = new ewq(fgt.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fgt.this.b(this);
            } else {
               this.d.m(16711680);
               fgt.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends ewn.a<fgt.f> {
      @Nullable
      final List<atk> a;

      public f(@Nullable List<atk> $$0) {
         this.a = $$0;
      }
   }

   public class g extends ewn<fgt.f> {
      public g(final csu $$1) {
         super(fgt.this.f, fgt.this.g, fgt.this.h, 43, fgt.this.h - 32, 24);
         final Map<csu.b, Map<csu.e<?>, fgt.f>> $$2 = Maps.newHashMap();
         csu.a(new csu.c() {
            @Override
            public void b(csu.e<csu.a> $$0, csu.f<csu.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fgt.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(csu.e<csu.d> $$0, csu.f<csu.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fgt.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends csu.g<T>> void a(csu.e<T> $$0, fgt.c<T> $$1x) {
               vb $$2 = vb.c($$0.b());
               vb $$3 = vb.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vb $$6 = vb.a("editGamerule.default", vb.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<atk> $$10;
               String $$11;
               if (geu.a($$7)) {
                  Builder<atk> $$8 = ImmutableList.builder().add($$3.g());
                  vb $$9 = vb.c($$7);
                  fgt.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fgt.this.new b(vb.c(((csu.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(csu.e::a)))
                     .forEach($$0xx -> this.b((fgt.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fgt.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fgt.this.b($$4.a);
         }
      }
   }
}
