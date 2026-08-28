import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqx {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private fqx.c b;
   private int c;

   public void a(fqx.b $$0, List<aua> $$1) {
      this.c++;
      if (this.b != null && !this.b.d) {
         a.warn("Reload already ongoing, replacing");
      }

      this.b = new fqx.c($$0, $$1.stream().map(aua::b).collect(ImmutableList.toImmutableList()));
   }

   public void a(Throwable $$0) {
      if (this.b == null) {
         a.warn("Trying to signal reload recovery, but nothing was started");
         this.b = new fqx.c(fqx.b.c, ImmutableList.of());
      }

      this.b.c = new fqx.a($$0);
   }

   public void a() {
      if (this.b == null) {
         a.warn("Trying to finish reload, but nothing was started");
      } else {
         this.b.d = true;
      }
   }

   public void a(p $$0) {
      q $$1 = $$0.a("Last reload");
      $$1.a("Reload number", this.c);
      if (this.b != null) {
         this.b.a($$1);
      }
   }

   static class a {
      private final Throwable a;

      a(Throwable $$0) {
         this.a = $$0;
      }

      public void a(q $$0) {
         $$0.a("Recovery", "Yes");
         $$0.a("Recovery reason", () -> {
            StringWriter $$0x = new StringWriter();
            this.a.printStackTrace(new PrintWriter($$0x));
            return $$0x.toString();
         });
      }
   }

   public static enum b {
      a("initial"),
      b("manual"),
      c("unknown");

      final String d;

      private b(final String $$0) {
         this.d = $$0;
      }
   }

   static class c {
      private final fqx.b a;
      private final List<String> b;
      @Nullable
      fqx.a c;
      boolean d;

      c(fqx.b $$0, List<String> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(q $$0) {
         $$0.a("Reload reason", this.a.d);
         $$0.a("Finished", this.d ? "Yes" : "No");
         $$0.a("Packs", () -> String.join(", ", this.b));
         if (this.c != null) {
            this.c.a($$0);
         }
      }
   }
}
