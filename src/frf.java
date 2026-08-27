import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class frf {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected frh e;

   public frf(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract frf b();

   public abstract ffl a(ffl var1, frj var2);

   public abstract static class a<R extends frf> {
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
      public frh h() {
         return this.a.e;
      }

      public void a(frh $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract frf.b c();

      public abstract Either<frf.c, frf.b> a(frj var1);
   }

   public static record b(vq e) {
      public static final frf.b a = new frf.b(vq.c("gui.abuseReport.send.no_reason"));
      public static final frf.b b = new frf.b(vq.c("gui.chatReport.send.no_reported_messages"));
      public static final frf.b c = new frf.b(vq.c("gui.chatReport.send.too_many_messages"));
      public static final frf.b d = new frf.b(vq.c("gui.abuseReport.send.comment_too_long"));

      public faz a() {
         return faz.a(this.e);
      }

      public vq b() {
         return this.e;
      }
   }

   public static record c(UUID a, fri b, AbuseReport c) {
   }
}
