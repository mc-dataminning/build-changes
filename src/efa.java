import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

public class efa extends eeu {
   public static final Codec<efa> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asg.a(efa.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, efa::new)
   );
   private final List<efa.b> b;

   efa(List<egh> $$0, List<efa.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eew b() {
      return eex.k;
   }

   @Override
   public Set<efq<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      ate $$2 = $$1.b();

      for (efa.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bjy $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bln($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static efa.c a(String $$0, ib<blk> $$1, bln.a $$2, ehc $$3) {
      return new efa.c($$0, $$1, $$2, $$3);
   }

   public static efa.a c() {
      return new efa.a();
   }

   public static class a extends eeu.a<efa.a> {
      private final List<efa.b> a = Lists.newArrayList();

      protected efa.a a() {
         return this;
      }

      public efa.a a(efa.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eev b() {
         return new efa(this.g(), this.a);
      }
   }

   static record b(String b, ib<blk> c, bln.a d, ehc e, List<bjy> f, Optional<UUID> g) {
      private static final Codec<List<bjy>> h = asg.a(
         Codec.either(bjy.g, bjy.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bjy)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<efa.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(efa.b::a),
                  jy.v.r().fieldOf("attribute").forGetter(efa.b::b),
                  bln.a.d.fieldOf("operation").forGetter(efa.b::c),
                  ehd.a.fieldOf("amount").forGetter(efa.b::d),
                  h.fieldOf("slot").forGetter(efa.b::e),
                  asg.a(iv.b, "id").forGetter(efa.b::f)
               )
               .apply($$0, efa.b::new)
      );

      public String a() {
         return this.b;
      }

      public ib<blk> b() {
         return this.c;
      }

      public bln.a c() {
         return this.d;
      }

      public ehc d() {
         return this.e;
      }

      public List<bjy> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ib<blk> b;
      private final bln.a c;
      private final ehc d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bjy> f = EnumSet.noneOf(bjy.class);

      public c(String $$0, ib<blk> $$1, bln.a $$2, ehc $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public efa.c a(bjy $$0) {
         this.f.add($$0);
         return this;
      }

      public efa.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public efa.b a() {
         return new efa.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
