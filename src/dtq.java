import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dtq(List<dtq.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dtq a = new dtq(List.of());
   public static final Codec<dtq> b = dtq.b.a.listOf().xmap(dtq::new, dtq::b);
   public static final yn<wa, dtq> c = dtq.b.b.a(yl.a()).a(dtq::new, dtq::b);

   public dtq a() {
      return new dtq(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dtq.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dtq.b> a = ImmutableList.builder();

      @Deprecated
      public dtq.a a(js<dtp> $$0, aku<dtp> $$1, cvm $$2) {
         Optional<jr.c<dtp>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dtq.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dtq.a a(jr<dtp> $$0, cvm $$1) {
         return this.a(new dtq.b($$0, $$1));
      }

      public dtq.a a(dtq.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dtq.a a(dtq $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dtq a() {
         return new dtq(this.a.build());
      }
   }

   public static record b(jr<dtp> c, cvm d) {
      public static final Codec<dtq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dtp.c.fieldOf("pattern").forGetter(dtq.b::b), cvm.q.fieldOf("color").forGetter(dtq.b::c)).apply($$0, dtq.b::new)
      );
      public static final yn<wa, dtq.b> b = yn.a(dtp.d, dtq.b::b, cvm.r, dtq.b::c, dtq.b::new);

      public xd a() {
         String $$0 = this.c.a().b();
         return wp.c($$0 + "." + this.d.b());
      }

      public jr<dtp> b() {
         return this.c;
      }

      public cvm c() {
         return this.d;
      }
   }
}
