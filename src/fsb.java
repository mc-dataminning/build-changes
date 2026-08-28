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

public class fsb extends fnd {
   private static final wu a = wu.c("editGamerule.title");
   private static final int b = 8;
   final fkz c = new fkz(this);
   private final Consumer<Optional<dbz>> q;
   private final Set<fsb.f> r = Sets.newHashSet();
   private final dbz s;
   @Nullable
   private fsb.g u;
   @Nullable
   private fhm v;

   public fsb(dbz $$0, Consumer<Optional<dbz>> $$1) {
      super(a);
      this.s = $$0;
      this.q = $$1;
   }

   @Override
   protected void aO_() {
      this.c.a(a, this.o);
      this.u = this.c.c(new fsb.g(this.s));
      fld $$0 = this.c.b(fld.e().a(8));
      this.v = $$0.a(fhm.a(wt.d, $$0x -> this.q.accept(Optional.of(this.s))).a());
      $$0.a(fhm.a(wt.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fhk var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      if (this.u != null) {
         this.u.a(this.m, this.c);
      }
   }

   @Override
   public void d() {
      this.q.accept(Optional.empty());
   }

   private void m() {
      if (this.v != null) {
         this.v.j = this.r.isEmpty();
      }
   }

   void a(fsb.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(fsb.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends fsb.d {
      private final fht<Boolean> c;

      public a(final wu $$1, final List<axq> $$2, final String $$3, final dbz.a $$4) {
         super($$2, $$1);
         this.c = fht.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fsb.f {
      final wu b;

      public b(final wu $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fsb.this.l.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fji> aF_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends flg> b() {
         return ImmutableList.of(new flg() {
            @Override
            public flg.a u() {
               return flg.a.b;
            }

            @Override
            public void b(fli $$0) {
               $$0.a(flh.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dbz.g<T>> {
      fsb.f create(wu var1, List<axq> var2, String var3, T var4);
   }

   public abstract class d extends fsb.f {
      private final List<axq> c;
      protected final List<fhk> a = Lists.newArrayList();

      public d(@Nullable final List<axq> $$1, final wu $$2) {
         super($$1);
         this.c = fsb.this.l.h.c($$2, 175);
      }

      @Override
      public List<? extends fji> aF_() {
         return this.a;
      }

      @Override
      public List<? extends flg> b() {
         return this.a;
      }

      protected void a(fgz $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fsb.this.l.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fsb.this.l.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fsb.this.l.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fsb.d {
      private final fhv d;

      public e(final wu $$1, final List<axq> $$2, final String $$3, final dbz.d $$4) {
         super($$2, $$1);
         this.d = new fhv(fsb.this.l.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fsb.this.b(this);
            } else {
               this.d.g(-65536);
               fsb.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fhs.a<fsb.f> {
      @Nullable
      final List<axq> a;

      public f(@Nullable List<axq> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fhs<fsb.f> {
      private static final int m = 24;

      public g(final dbz $$1) {
         super(ffn.Q(), fsb.this.m, fsb.this.c.d(), fsb.this.c.c(), 24);
         final Map<dbz.b, Map<dbz.e<?>, fsb.f>> $$2 = Maps.newHashMap();
         dbz.a(new dbz.c() {
            @Override
            public void b(dbz.e<dbz.a> $$0, dbz.f<dbz.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fsb.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dbz.e<dbz.d> $$0, dbz.f<dbz.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fsb.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dbz.g<T>> void a(dbz.e<T> $$0, fsb.c<T> $$1x) {
               wu $$2 = wu.c($$0.b());
               wu $$3 = wu.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wu $$6 = wu.a("editGamerule.default", wu.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<axq> $$10;
               String $$11;
               if (gqo.a($$7)) {
                  Builder<axq> $$8 = ImmutableList.builder().add($$3.g());
                  wu $$9 = wu.c($$7);
                  fsb.this.o.c($$9, 150).forEach($$8::add);
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
                  this.b(fsb.this.new b(wu.c(((dbz.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dbz.e::a)))
                     .forEach($$0xx -> this.b((fsb.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fgz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fsb.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fsb.this.b($$4.a);
         }
      }
   }
}
