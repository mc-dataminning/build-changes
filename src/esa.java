import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

public class esa extends ert {
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayg.a(esa.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esa::new)
   );
   private final List<esa.b> b;
   private final boolean c;

   esa(List<etr> $$0, List<esa.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public erv<esa> b() {
      return erw.o;
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if (this.c) {
         $$0.b(km.n, this.a($$1, cxj.a));
      } else {
         $$0.a(km.n, cxj.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cxj a(eqh $$0, cxj $$1) {
      azg $$2 = $$0.b();

      for (esa.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         btb $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new buu($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static esa.c a(String $$0, ji<bur> $$1, buu.a $$2, eum $$3) {
      return new esa.c($$0, $$1, $$2, $$3);
   }

   public static esa.a c() {
      return new esa.a();
   }

   public static class a extends ert.a<esa.a> {
      private final boolean a;
      private final List<esa.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected esa.a a() {
         return this;
      }

      public esa.a a(esa.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public eru b() {
         return new esa(this.g(), this.b, this.a);
      }
   }

   static record b(String b, ji<bur> c, buu.a d, eum e, List<btb> f, Optional<UUID> g) {
      private static final Codec<List<btb>> h = ayg.a(
         Codec.either(btb.l, btb.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((btb)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<esa.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(esa.b::a),
                  lp.u.r().fieldOf("attribute").forGetter(esa.b::b),
                  buu.a.f.fieldOf("operation").forGetter(esa.b::c),
                  eun.a.fieldOf("amount").forGetter(esa.b::d),
                  h.fieldOf("slot").forGetter(esa.b::e),
                  kc.d.optionalFieldOf("id").forGetter(esa.b::f)
               )
               .apply($$0, esa.b::new)
      );

      public String a() {
         return this.b;
      }

      public ji<bur> b() {
         return this.c;
      }

      public buu.a c() {
         return this.d;
      }

      public eum d() {
         return this.e;
      }

      public List<btb> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ji<bur> b;
      private final buu.a c;
      private final eum d;
      private Optional<UUID> e = Optional.empty();
      private final Set<btb> f = EnumSet.noneOf(btb.class);

      public c(String $$0, ji<bur> $$1, buu.a $$2, eum $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public esa.c a(btb $$0) {
         this.f.add($$0);
         return this;
      }

      public esa.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public esa.b a() {
         return new esa.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
