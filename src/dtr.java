import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dtr(List<dtr.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dtr a = new dtr(List.of());
   public static final Codec<dtr> b = dtr.b.a.listOf().xmap(dtr::new, dtr::b);
   public static final yn<wa, dtr> c = dtr.b.b.a(yl.a()).a(dtr::new, dtr::b);

   public dtr a() {
      return new dtr(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dtr.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dtr.b> a = ImmutableList.builder();

      @Deprecated
      public dtr.a a(js<dtq> $$0, aku<dtq> $$1, cvn $$2) {
         Optional<jr.c<dtq>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dtr.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dtr.a a(jr<dtq> $$0, cvn $$1) {
         return this.a(new dtr.b($$0, $$1));
      }

      public dtr.a a(dtr.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dtr.a a(dtr $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dtr a() {
         return new dtr(this.a.build());
      }
   }

   public static record b(jr<dtq> c, cvn d) {
      public static final Codec<dtr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dtq.c.fieldOf("pattern").forGetter(dtr.b::b), cvn.q.fieldOf("color").forGetter(dtr.b::c)).apply($$0, dtr.b::new)
      );
      public static final yn<wa, dtr.b> b = yn.a(dtq.d, dtr.b::b, cvn.r, dtr.b::c, dtr.b::new);

      public xd a() {
         String $$0 = this.c.a().b();
         return wp.c($$0 + "." + this.d.b());
      }

      public jr<dtq> b() {
         return this.c;
      }

      public cvn c() {
         return this.d;
      }
   }
}
