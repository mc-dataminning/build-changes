import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dto(List<dto.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dto a = new dto(List.of());
   public static final Codec<dto> b = dto.b.a.listOf().xmap(dto::new, dto::b);
   public static final ym<vz, dto> c = dto.b.b.a(yk.a()).a(dto::new, dto::b);

   public dto a() {
      return new dto(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dto.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dto.b> a = ImmutableList.builder();

      @Deprecated
      public dto.a a(js<dtn> $$0, akt<dtn> $$1, cvk $$2) {
         Optional<jr.c<dtn>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dto.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dto.a a(jr<dtn> $$0, cvk $$1) {
         return this.a(new dto.b($$0, $$1));
      }

      public dto.a a(dto.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dto.a a(dto $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dto a() {
         return new dto(this.a.build());
      }
   }

   public static record b(jr<dtn> c, cvk d) {
      public static final Codec<dto.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dtn.c.fieldOf("pattern").forGetter(dto.b::b), cvk.q.fieldOf("color").forGetter(dto.b::c)).apply($$0, dto.b::new)
      );
      public static final ym<vz, dto.b> b = ym.a(dtn.d, dto.b::b, cvk.r, dto.b::c, dto.b::new);

      public xc a() {
         String $$0 = this.c.a().b();
         return wo.c($$0 + "." + this.d.b());
      }

      public jr<dtn> b() {
         return this.c;
      }

      public cvk c() {
         return this.d;
      }
   }
}
