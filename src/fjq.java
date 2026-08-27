import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fjq {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fjs e;

   public fjq(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fjq b();

   public abstract eyf a(eyf var1, fju var2);

   public abstract static class a<R extends fjq> {
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
      public fjs h() {
         return this.a.e;
      }

      public void a(fjs $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fjq.b c();

      public abstract Either<fjq.c, fjq.b> a(fju var1);
   }

   public static record b(ti e) {
      public static final fjq.b a = new fjq.b(ti.c("gui.abuseReport.send.no_reason"));
      public static final fjq.b b = new fjq.b(ti.c("gui.chatReport.send.no_reported_messages"));
      public static final fjq.b c = new fjq.b(ti.c("gui.chatReport.send.too_many_messages"));
      public static final fjq.b d = new fjq.b(ti.c("gui.abuseReport.send.comment_too_long"));

      public etv a() {
         return etv.a(this.e);
      }

      public ti b() {
         return this.e;
      }
   }

   public static record c(UUID a, fjt b, AbuseReport c) {
   }
}
