import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dpe(List<dpe.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dpe a = new dpe(List.of());
   public static final Codec<dpe> b = dpe.b.a.listOf().xmap(dpe::new, dpe::b);
   public static final ys<wf, dpe> c = dpe.b.b.a(yq.a()).a(dpe::new, dpe::b);

   public dpe a() {
      return new dpe(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dpe.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dpe.b> a = ImmutableList.builder();

      @Deprecated
      public dpe.a a(jk<dpd> $$0, akj<dpd> $$1, cst $$2) {
         Optional<jj.c<dpd>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dpe.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dpe.a a(jj<dpd> $$0, cst $$1) {
         return this.a(new dpe.b($$0, $$1));
      }

      public dpe.a a(dpe.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dpe.a a(dpe $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dpe a() {
         return new dpe(this.a.build());
      }
   }

   public static record b(jj<dpd> c, cst d) {
      public static final Codec<dpe.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpd.c.fieldOf("pattern").forGetter(dpe.b::b), cst.q.fieldOf("color").forGetter(dpe.b::c)).apply($$0, dpe.b::new)
      );
      public static final ys<wf, dpe.b> b = ys.a(dpd.d, dpe.b::b, cst.r, dpe.b::c, dpe.b::new);

      public xi a() {
         String $$0 = this.c.a().b();
         return wu.c($$0 + "." + this.d.b());
      }

      public jj<dpd> b() {
         return this.c;
      }

      public cst c() {
         return this.d;
      }
   }
}
