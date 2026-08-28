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

public class esp extends esj {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(esp.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, esp::new)
   );
   private final List<esp.b> b;
   private final boolean c;

   esp(List<euh> $$0, List<esp.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public esl<esp> b() {
      return esm.o;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if (this.c) {
         $$0.b(kn.n, this.a($$1, cwx.a));
      } else {
         $$0.a(kn.n, cwx.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cwx a(eqw $$0, cwx $$1) {
      ayo $$2 = $$0.b();

      for (esp.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bsp $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bui($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static esp.c a(String $$0, jj<buf> $$1, bui.a $$2, evd $$3) {
      return new esp.c($$0, $$1, $$2, $$3);
   }

   public static esp.a c() {
      return new esp.a();
   }

   public static class a extends esj.a<esp.a> {
      private final boolean a;
      private final List<esp.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected esp.a a() {
         return this;
      }

      public esp.a a(esp.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public esk b() {
         return new esp(this.g(), this.b, this.a);
      }
   }

   static record b(String b, jj<buf> c, bui.a d, evd e, List<bsp> f, Optional<UUID> g) {
      private static final Codec<List<bsp>> h = axo.a(
         Codec.either(bsp.l, bsp.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bsp)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<esp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(esp.b::a),
                  buf.a.fieldOf("attribute").forGetter(esp.b::b),
                  bui.a.f.fieldOf("operation").forGetter(esp.b::c),
                  eve.a.fieldOf("amount").forGetter(esp.b::d),
                  h.fieldOf("slot").forGetter(esp.b::e),
                  kd.d.optionalFieldOf("id").forGetter(esp.b::f)
               )
               .apply($$0, esp.b::new)
      );

      public String a() {
         return this.b;
      }

      public jj<buf> b() {
         return this.c;
      }

      public bui.a c() {
         return this.d;
      }

      public evd d() {
         return this.e;
      }

      public List<bsp> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final jj<buf> b;
      private final bui.a c;
      private final evd d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bsp> f = EnumSet.noneOf(bsp.class);

      public c(String $$0, jj<buf> $$1, bui.a $$2, evd $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public esp.c a(bsp $$0) {
         this.f.add($$0);
         return this;
      }

      public esp.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public esp.b a() {
         return new esp.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
