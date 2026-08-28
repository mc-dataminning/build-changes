import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dqv(List<dqv.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dqv a = new dqv(List.of());
   public static final Codec<dqv> b = dqv.b.a.listOf().xmap(dqv::new, dqv::b);
   public static final zb<wo, dqv> c = dqv.b.b.a(yz.a()).a(dqv::new, dqv::b);

   public dqv a() {
      return new dqv(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dqv.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dqv.b> a = ImmutableList.builder();

      @Deprecated
      public dqv.a a(jo<dqu> $$0, ala<dqu> $$1, cue $$2) {
         Optional<jn.c<dqu>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dqv.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dqv.a a(jn<dqu> $$0, cue $$1) {
         return this.a(new dqv.b($$0, $$1));
      }

      public dqv.a a(dqv.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dqv.a a(dqv $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dqv a() {
         return new dqv(this.a.build());
      }
   }

   public static record b(jn<dqu> c, cue d) {
      public static final Codec<dqv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dqu.c.fieldOf("pattern").forGetter(dqv.b::b), cue.q.fieldOf("color").forGetter(dqv.b::c)).apply($$0, dqv.b::new)
      );
      public static final zb<wo, dqv.b> b = zb.a(dqu.d, dqv.b::b, cue.r, dqv.b::c, dqv.b::new);

      public xr a() {
         String $$0 = this.c.a().b();
         return xd.c($$0 + "." + this.d.b());
      }

      public jn<dqu> b() {
         return this.c;
      }

      public cue c() {
         return this.d;
      }
   }
}
