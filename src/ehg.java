import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ehg extends ehq {
   public static final Codec<ehg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kb.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(djs::f).toList())
               )
            )
            .apply($$0, ehg::new)
   );
   private final ie<cvz> b;
   private final Set<djs<?>> c;

   ehg(List<ejd> $$0, ie<cvz> $$1, Set<djs<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ehg(List<ejd> $$0, ie<cvz> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public ehs b() {
      return eht.x;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.g);
   }

   @Override
   protected cmh a(cmh $$0, ege $$1) {
      dip $$2 = $$1.c(eip.g);
      if ($$2 != null) {
         sj $$3 = $$0.w();
         sj $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new sj();
            $$3.a("BlockStateTag", $$4);
         }

         for (djs<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static ehg.a a(cvz $$0) {
      return new ehg.a($$0);
   }

   private static <T extends Comparable<T>> String a(dip $$0, djs<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends ehq.a<ehg.a> {
      private final ie<cvz> a;
      private final Builder<djs<?>> b = ImmutableSet.builder();

      a(cvz $$0) {
         this.a = $$0.r();
      }

      public ehg.a a(djs<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ehg.a a() {
         return this;
      }

      @Override
      public ehr b() {
         return new ehg(this.g(), this.a, this.b.build());
      }
   }
}
