import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fpe {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fpg e;

   public fpe(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fpe b();

   public abstract fdm a(fdm var1, fpi var2);

   public abstract static class a<R extends fpe> {
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
      public fpg h() {
         return this.a.e;
      }

      public void a(fpg $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fpe.b c();

      public abstract Either<fpe.c, fpe.b> a(fpi var1);
   }

   public static record b(vg e) {
      public static final fpe.b a = new fpe.b(vg.c("gui.abuseReport.send.no_reason"));
      public static final fpe.b b = new fpe.b(vg.c("gui.chatReport.send.no_reported_messages"));
      public static final fpe.b c = new fpe.b(vg.c("gui.chatReport.send.too_many_messages"));
      public static final fpe.b d = new fpe.b(vg.c("gui.abuseReport.send.comment_too_long"));

      public ezc a() {
         return ezc.a(this.e);
      }

      public vg b() {
         return this.e;
      }
   }

   public static record c(UUID a, fph b, AbuseReport c) {
   }
}
