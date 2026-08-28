import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ce(List<ddp> d) {
   public static final ce a = a(ddp.values());
   public static final ce b = a(ddp.a, ddp.c);
   public static final Codec<ce> c = ddp.f.listOf().xmap(ce::new, ce::a);

   public static ce a(ddp... $$0) {
      return new ce(Arrays.stream($$0).toList());
   }

   public boolean a(ddp $$0) {
      return this.d.contains($$0);
   }

   public List<ddp> a() {
      return this.d;
   }
}
