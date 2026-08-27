import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class elw extends emg {
   public static final Codec<elw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ki.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(doc::f).toList())
               )
            )
            .apply($$0, elw::new)
   );
   private final il<daa> b;
   private final Set<doc<?>> c;

   elw(List<ent> $$0, il<daa> $$1, Set<doc<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private elw(List<ent> $$0, il<daa> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public emi b() {
      return emj.x;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.g);
   }

   @Override
   protected cqk a(cqk $$0, eku $$1) {
      dmz $$2 = $$1.c(enf.g);
      if ($$2 != null) {
         ta $$3 = $$0.x();
         ta $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new ta();
            $$3.a("BlockStateTag", $$4);
         }

         for (doc<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static elw.a a(daa $$0) {
      return new elw.a($$0);
   }

   private static <T extends Comparable<T>> String a(dmz $$0, doc<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends emg.a<elw.a> {
      private final il<daa> a;
      private final Builder<doc<?>> b = ImmutableSet.builder();

      a(daa $$0) {
         this.a = $$0.r();
      }

      public elw.a a(doc<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected elw.a a() {
         return this;
      }

      @Override
      public emh b() {
         return new elw(this.g(), this.a, this.b.build());
      }
   }
}
