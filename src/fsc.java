import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fsc {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fse e;

   public fsc(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fsc b();

   public abstract fgh a(fgh var1, fsg var2);

   public abstract static class a<R extends fsc> {
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
      public fse h() {
         return this.a.e;
      }

      public void a(fse $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fsc.b c();

      public abstract Either<fsc.c, fsc.b> a(fsg var1);
   }

   public static record b(vs e) {
      public static final fsc.b a = new fsc.b(vs.c("gui.abuseReport.send.no_reason"));
      public static final fsc.b b = new fsc.b(vs.c("gui.chatReport.send.no_reported_messages"));
      public static final fsc.b c = new fsc.b(vs.c("gui.chatReport.send.too_many_messages"));
      public static final fsc.b d = new fsc.b(vs.c("gui.abuseReport.send.comment_too_long"));

      public fbv a() {
         return fbv.a(this.e);
      }

      public vs b() {
         return this.e;
      }
   }

   public static record c(UUID a, fsf b, AbuseReport c) {
   }
}
