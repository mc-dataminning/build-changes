import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fjl {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fjn e;

   public fjl(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fjl b();

   public abstract eya a(eya var1, fjp var2);

   public abstract static class a<R extends fjl> {
      protected final R a;
      protected final AbuseReportLimits b;

      protected a(R $$0, AbuseReportLimits $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public R e() {
         return this.a;
      }

      public UUID f() {
         return this.a.c;
      }

      public String g() {
         return this.a.d;
      }

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public fjn h() {
         return this.a.e;
      }

      public void a(fjn $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fjl.b c();

      public abstract Either<fjl.c, fjl.b> a(fjp var1);
   }

   public static record b(tf e) {
      public static final fjl.b a = new fjl.b(tf.c("gui.abuseReport.send.no_reason"));
      public static final fjl.b b = new fjl.b(tf.c("gui.chatReport.send.no_reported_messages"));
      public static final fjl.b c = new fjl.b(tf.c("gui.chatReport.send.too_many_messages"));
      public static final fjl.b d = new fjl.b(tf.c("gui.abuseReport.send.comment_too_long"));

      public etq a() {
         return etq.a(this.e);
      }

      public tf b() {
         return this.e;
      }
   }

   public static record c(UUID a, fjo b, AbuseReport c) {
   }
}
