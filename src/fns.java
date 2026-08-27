import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fns {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fnu e;

   public fns(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fns b();

   public abstract fcc a(fcc var1, fnw var2);

   public abstract static class a<R extends fns> {
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
      public fnu h() {
         return this.a.e;
      }

      public void a(fnu $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fns.b c();

      public abstract Either<fns.c, fns.b> a(fnw var1);
   }

   public static record b(vb e) {
      public static final fns.b a = new fns.b(vb.c("gui.abuseReport.send.no_reason"));
      public static final fns.b b = new fns.b(vb.c("gui.chatReport.send.no_reported_messages"));
      public static final fns.b c = new fns.b(vb.c("gui.chatReport.send.too_many_messages"));
      public static final fns.b d = new fns.b(vb.c("gui.abuseReport.send.comment_too_long"));

      public exs a() {
         return exs.a(this.e);
      }

      public vb b() {
         return this.e;
      }
   }

   public static record c(UUID a, fnv b, AbuseReport c) {
   }
}
